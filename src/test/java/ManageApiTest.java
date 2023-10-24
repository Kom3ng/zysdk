import okhttp3.OkHttpClient;
import org.abstruck.zysdk.ZySdk;
import org.abstruck.zysdk.api.ManageApi;
import org.abstruck.zysdk.data.req.GetMessageRequest;
import org.abstruck.zysdk.data.req.LoginRequest;
import org.abstruck.zysdk.data.resp.MessageList;
import org.abstruck.zysdk.data.resp.TokenInfo;
import org.junit.jupiter.api.Test;


public class ManageApiTest {
    @Test
    public void testLoginApi(){
        ManageApi manageApi = ZySdk.init(new OkHttpClient()).getApi().manage();
        TokenInfo info = manageApi.login(new LoginRequest("18877868372", "lws868372", 1));
        System.out.println(info);
    }
}
