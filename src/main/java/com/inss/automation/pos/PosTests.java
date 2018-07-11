package com.inss.automation.pos;

import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;
import org.jpos.iso.channel.ASCIIChannel;
import org.jpos.iso.packager.GenericPackager;
import org.junit.Test;

public class PosTests extends PosTestsBase {

    @Test
    public void NetworkManagementRequestShouldBeSentSuccesfully() throws Exception {

        //Connect and Send txn
        asciiChannel.send(generateNetworkManagementRequestPayload());

        //get and evaluate response body
        ISOMsg response = asciiChannel.receive();
        String mti = response.getMTI();
        System.out.println(mti);
    }
}
