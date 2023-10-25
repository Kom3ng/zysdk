import okhttp3.OkHttpClient;
import org.abstruck.zysdk.ZySdk;
import org.abstruck.zysdk.api.Api;
import org.abstruck.zysdk.api.ManageApi;
import org.abstruck.zysdk.data.req.LoginRequest;
import org.abstruck.zysdk.data.resp.Catalog;
import org.abstruck.zysdk.data.resp.TokenInfo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class ManageApiTest {
    @Test
    public void testLoginApi(){
        ManageApi manageApi = ZySdk.init(new OkHttpClient()).getApi().manage();
        TokenInfo info = manageApi.login(new LoginRequest("22zhoumoxixuan", "123456", 1));
        System.out.println(info);
    }
    @Test
    public void testSomeApi(){
        Api api = ZySdk.init().getApi();
        ManageApi manageApi = api.manage();
        String token = manageApi.login(new LoginRequest("22zhoumoxixuan", "123456", 1)).accessToken();
        Catalog[] catalogs = api.quora().getCatalogs(token);
        System.out.println(Arrays.toString(catalogs));
    }

}
