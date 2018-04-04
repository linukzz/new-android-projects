package bugil.bada.bugilapp;

import bugil.bada.bugilapp.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class SplashActivity extends Activity {

	int splashSceneNumber;

	LinearLayout splashLayout;

	Handler mHandler;

	boolean isClick;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash1);
		getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		// TODO Auto-generated method stub

		// xml �ҽ� ����
		splashLayout = (LinearLayout) findViewById(R.id.splashLayout);

		// ó��ȭ�� 0
		splashSceneNumber = 0;

		// Ŭ�� �̺�Ʈ�� �־����� Ȯ��
		isClick = true;

		mHandler = new Handler() {
			@Override
			public void handleMessage(Message msg) {
				switch (splashSceneNumber) {
				case 0:
					// �ι�° ȭ��
					splashSceneNumber = 1;

					splashLayout.setBackgroundDrawable(getResources()
							.getDrawable(R.drawable.nsplash1));

					mHandler.sendEmptyMessage(splashSceneNumber);
					Intent intent = new Intent(SplashActivity.this, MainActivity.class);
					startActivity(intent);
					
					SplashActivity.this.finish();
					break;

				
					}
					
				}
			
		};
		mHandler.sendEmptyMessageDelayed(3, 2000);}
	

	public void hn_splashOnclick(View v) {

		switch (splashSceneNumber) {
		case 0:
			splashSceneNumber = 0;

			isClick = false;
			mHandler.sendEmptyMessage(splashSceneNumber);
			break;

		case 1:
			splashSceneNumber = 2;
			mHandler.sendEmptyMessage(splashSceneNumber);
			break;
		}
	}
}

