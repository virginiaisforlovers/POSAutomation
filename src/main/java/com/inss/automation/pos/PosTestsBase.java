package com.inss.automation.pos;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;
import org.jpos.iso.channel.ASCIIChannel;
import org.jpos.iso.packager.GenericPackager;
import org.junit.Before;


public class PosTestsBase {

  ISOPackager isoPackager;
  ASCIIChannel asciiChannel;

  @Before
  public void initializePos() throws Exception {
    isoPackager = new GenericPackager("iso87asciipackager.xml");
    asciiChannel = new ASCIIChannel("10.120.100.10", 56715, isoPackager);
    asciiChannel.connect();
    asciiChannel.setHeader("INSS00");
  }

  ISOMsg generateNetworkManagementRequestPayload() {
    ISOMsg isoMessage = new ISOMsg("0800");
    isoMessage.set(7, generateCurrentDateAndTime());
    isoMessage.set(11, "000378");
    isoMessage.set(12, generateCurrentDateAndTime());
    isoMessage.set(13, generateCurrentDateAndTime());
    isoMessage.set(32, "5500033");
    isoMessage.set(41, "T0000002");
    isoMessage.set(61, "01010980401000201580000000000F00000000000400000");
    isoMessage.set(70, "501");
    isoMessage.set(120, "-41");
    return isoMessage;
  }

  private String generateCurrentDateAndTime() {
    return new SimpleDateFormat("MMddHHmmss").format(new Date());
  }

}
