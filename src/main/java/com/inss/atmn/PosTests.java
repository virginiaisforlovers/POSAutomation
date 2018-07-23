package com.inss.atmn;

import org.jpos.iso.ISOMsg;
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
