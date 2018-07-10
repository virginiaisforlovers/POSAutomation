package com.inss.automation.pos.data;



import org.jpos.iso.ISOMsg;


import java.text.SimpleDateFormat;
import java.util.Date;

public class POSRequestPayload {


    public ISOMsg generateNetworkManagementRequestPayload() {

        ISOMsg message = new ISOMsg("0800");
        message.set(7, new SimpleDateFormat("MMddHHmmss").format(new Date()));
        message.set(11, "000358");
        message.set(12, new SimpleDateFormat("HHmmss").format(new Date()));
        message.set(13, new SimpleDateFormat("HHmmss").format(new Date()));
        message.set(32, "5500033");
        message.set(41, "T0000002");
        message.set(61, "01010980401000201580000000000F00000000000400000");
        message.set(70, "501");
        message.set(120, "-41");


        return message;
    }


}
