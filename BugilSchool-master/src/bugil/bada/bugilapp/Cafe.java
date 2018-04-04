package bugil.bada.bugilapp;

import bugil.bada.bugilapp.R;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Cafe extends SherlockActivity {
    WebView mWeb;
    private Handler mHandler;
    private ProgressDialog mProgressDialog;

    @SuppressLint("SetJavaScriptEnabled")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Ÿ��Ʋ��(�׼ǹ�) �����
        Window win = getWindow();
        win.requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_cafe);
        //�ڵ鷯 ���
        mHandler = new Handler();
        
        runOnUiThread(new Runnable()
        {
            @Override
            public void run()
            {
                mProgressDialog = ProgressDialog.show(Cafe.this,"", 
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
        //webview��� �� ī�� �ε�
        mWeb = (WebView)findViewById(R.id.web);
        mWeb.setWebViewClient(new mmWebClient());
        WebSettings set = mWeb.getSettings();
        set.setJavaScriptEnabled(true);
        set.setBuiltInZoomControls(true);
        mWeb.loadUrl("http://m.cafe.naver.com/bukils");
    }
    //Ŭ��
    public void mOnClick(View v){
    	int id = v.getId();
    	//back��ư Ŭ���� �ڷ� ����
		if (id == R.id.back) {
			if(mWeb.canGoBack()) {
    			mWeb.goBack();
    		}
			//forward��ư Ŭ�� �� ������ ����
		} else if (id == R.id.forward) {
			if(mWeb.canGoForward()) {
    			mWeb.goForward();
    		}
			//home��ư Ŭ���� ó�� ȭ������ �ٽ� ���ư���
		} else if (id == R.id.home) {
			mWeb.loadUrl("http://m.cafe.naver.com/bukils");
			//exit��ư Ŭ���� �����ϱ�
		} else if (id == R.id.exit) {
			finish();
		}
    	
    }
//view�� URL�� �ҷ������� �ϱ�
    class mmWebClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    //�޴����� back��ư Ŭ�� �� �ڷ� ����
    public boolean onKeyDown(int keyCode, KeyEvent event) {
		if ((keyCode == KeyEvent.KEYCODE_BACK) && mWeb.canGoBack()) {
			mWeb.goBack();
			return true;
	        }
		return super.onKeyDown(keyCode, event);
	}
    public boolean onCreateOptionsMenu(Menu menu) {
    	getSupportMenuInflater().inflate(R.menu.cafe, menu);
        return true;

    }
    
}
