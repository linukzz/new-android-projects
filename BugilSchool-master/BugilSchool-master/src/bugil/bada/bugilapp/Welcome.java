package bugil.bada.bugilapp;

import bugil.bada.bugilapp.R;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.actionbarsherlock.app.SherlockActivity;



public class Welcome extends SherlockActivity {
    WebView aWeb;
    private Handler mHandler;
    private ProgressDialog mProgressDialog;

	@SuppressLint("SetJavaScriptEnabled")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //�׼ǹ� �����
        Window win = getWindow();
        win.requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);
        //�ڵ鷯 ���
mHandler = new Handler();
        
        runOnUiThread(new Runnable()
        {
            @Override
            public void run()
            {
                mProgressDialog = ProgressDialog.show(Welcome.this,"", 
                        "��ø� ��ٷ� �ּ���.",true);
                mHandler.postDelayed( new Runnable()
                {
                    @Override
                    public void run()
                    {
                        try
                        {
                            if (mProgressDialog!=null&&mProgressDialog.isShowing()){
                                mProgressDialog.dismiss();
                            }
                        }
                        catch ( Exception e )
                        {
                            e.printStackTrace();
                        }
                    }
                }, 2000);
            }
        } );
        //webview ���
        aWeb = (WebView)findViewById(R.id.welcomeweb);
        aWeb.setWebViewClient(new AAWeb());
        WebSettings go = aWeb.getSettings();
        go.setJavaScriptEnabled(true);
        go.setBuiltInZoomControls(true);
        aWeb.loadUrl("http://m.bugil.hs.kr/mobile/admission/admission01.jsp");
        
    }
   
}
//webview Client�� url�� �ҷ����� �ϱ�
class AAWeb extends WebViewClient {
    public boolean shouldOverrideUrlLoading(WebView aaview, String qurl) {
        aaview.loadUrl(qurl);
        return true;
    }
}
