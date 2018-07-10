import com.inss.automation.pos.data.POSRequestPayload;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;
import org.jpos.iso.channel.ASCIIChannel;
import org.jpos.iso.packager.GenericPackager;
import org.junit.Test;

public class POSTests extends POSRequestPayload {

    @Test
    public void NetworkManagementRequestShouldBeSentSuccesfully() throws Exception {

        ISOPackager packager = new GenericPackager("iso87asciipackager.xml");

        ASCIIChannel channel = new ASCIIChannel("10.120.100.10", 56715, packager);

        channel.connect();

        channel.send(generateNetworkManagementRequestPayload());

        ISOMsg response = channel.receive();

        String mti = response.getMTI();

        System.out.println(mti);


    }
}
