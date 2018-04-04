package bugil.bada.bugilapp.intro;

import bugil.bada.bugilapp.R;
import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuInflater;


public class Intro extends SherlockActivity {
	Button intro1, intro2, intro3, intro4;
	View yPage1, yPage2, yPage3, yPage4;
	View mPage1, mPage2, mPage3, mPage4;
	MediaPlayer m;
	Context c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_intro);
        //array�� y1�� list70�� ���
        ArrayAdapter<CharSequence> Ad;
        Ad = ArrayAdapter.createFromResource(this, R.array.y1, android.R.layout.simple_list_item_1);
        ListView l = (ListView)findViewById(R.id.list70);
        l.setAdapter(Ad);
        //array�� y2�� list80�� ���
        ArrayAdapter<CharSequence> Ad1;
        Ad1 = ArrayAdapter.createFromResource(this, R.array.y2, android.R.layout.simple_list_item_1);
        ListView l1 = (ListView)findViewById(R.id.list80);
        l1.setAdapter(Ad1);
        //array�� y3�� list90�� ���
        ArrayAdapter<CharSequence> Ad2;
        Ad2 = ArrayAdapter.createFromResource(this, R.array.y3, android.R.layout.simple_list_item_1);
        ListView l2 = (ListView)findViewById(R.id.list90);
        l2.setAdapter(Ad2);
        //array�� y4�� list20�� ���
        ArrayAdapter<CharSequence> Ad3;
        Ad3 = ArrayAdapter.createFromResource(this, R.array.y4, android.R.layout.simple_list_item_1);
        ListView l3 = (ListView)findViewById(R.id.list20);
        l3.setAdapter(Ad3);
        //�ҷ�����
        mPage1 = findViewById(R.id.tab1);
        mPage2 = findViewById(R.id.tab2);
        mPage3 = findViewById(R.id.tab3);
        mPage4 = findViewById(R.id.tab4);
        yPage1 = findViewById(R.id.ylist1);
        yPage2 = findViewById(R.id.ylist2);
        yPage3 = findViewById(R.id.ylist3);
        yPage4 = findViewById(R.id.ylist4);
        ((Button)findViewById(R.id.intradio1)).setOnClickListener(mClickListener);
        ((Button)findViewById(R.id.intradio2)).setOnClickListener(mClickListener);
        ((Button)findViewById(R.id.intradio3)).setOnClickListener(mClickListener);
        ((Button)findViewById(R.id.intradio4)).setOnClickListener(mClickListener);
        ((Button)findViewById(R.id.ybtn1)).setOnClickListener(yClickListener);
        ((Button)findViewById(R.id.ybtn2)).setOnClickListener(yClickListener);
        ((Button)findViewById(R.id.ybtn3)).setOnClickListener(yClickListener);
        ((Button)findViewById(R.id.ybtn4)).setOnClickListener(yClickListener);
        Button btnPlay = (Button)findViewById(R.id.play);
        Button btnStop = (Button)findViewById(R.id.stop);
    
        btnPlay.setOnClickListener(aClickListener);
        btnStop.setOnClickListener(aClickListener);
        Button btnPlay1 = (Button)findViewById(R.id.play1);
        Button btnStop1 = (Button)findViewById(R.id.stop1);
    
        btnPlay1.setOnClickListener(bClickListener);
        btnStop1.setOnClickListener(bClickListener);
    }
    
    //intradio��ư(Ŀ������) Ŭ���� ChangePage(�ؿ� �ֽ��ϴ�)�����ϱ�
    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        public void onClick(View v) {
        	switch (v.getId()) {
            case R.id.intradio1:
            	ChangePage(1);
            	break;
            case R.id.intradio2:
            	ChangePage(2);
            	break;
            case R.id.intradio3:
            	ChangePage(3);
            	break;
            case R.id.intradio4:
            	ChangePage(4);
            	break;
        }

        }
    };
    //bClickListener Ŭ����  Play�� Stop �����ϱ�
    Button.OnClickListener bClickListener = new Button.OnClickListener() {
    	public void onClick(View v){
            int id = v.getId();
            if(id == R.id.play1){
                play();
            }else if(id == R.id.stop1){
            stop();
            }else{
            //do nothing
            }
        }

        //Play music
        public void play(){
            c = getApplicationContext();
            try {
                stop();
                m = MediaPlayer.create(c, R.raw.man2);
                m.setLooping(true);
                m.start();
            }catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }

    //Stop music play
        public void stop()
        {
            try {
                if(m != null)
                {
                    m.stop();
                    m.release();
                    m = null;
                }
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    };




    Button.OnClickListener aClickListener = new Button.OnClickListener() {
    	public void onClick(View v){
            int id = v.getId();
            if(id == R.id.play){
                play();
            }else if(id == R.id.stop){
            stop();
            }else{
            //do nothing
            }
        }

        //Play music
        public void play(){
            c = getApplicationContext();
            try {
                stop();
                m = MediaPlayer.create(c, R.raw.schoolsong);
                m.setLooping(true);
                m.start();
            }catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }

    //Stop music play
        public void stop()
        {
            try {
                if(m != null)
                {
                    m.stop();
                    m.release();
                    m = null;
                }
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    };
    
    //yClickLister Ŭ���� ChangeList(�ؿ� �־��) �����ϱ�
    Button.OnClickListener yClickListener = new Button.OnClickListener() {
        public void onClick(View v) {
        	switch (v.getId()) {
            case R.id.ybtn1:
            	ChangeList(1);
            	break;
            case R.id.ybtn2:
            	ChangeList(2);
            	break;
            case R.id.ybtn3:
            	ChangeList(3);
            	break;
            case R.id.ybtn4:
            	ChangeList(4);
            	break;
        }

        }
    };



    void ChangePage(int page) {
        mPage1.setVisibility(View.INVISIBLE);
        mPage2.setVisibility(View.INVISIBLE);
        mPage3.setVisibility(View.INVISIBLE);
        mPage4.setVisibility(View.INVISIBLE);

        switch (page) {
            case 1:
                mPage1.setVisibility(View.VISIBLE);
                break;
            case 2:
                mPage2.setVisibility(View.VISIBLE);
                break;
            case 3:
                mPage3.setVisibility(View.VISIBLE);
                break;
            case 4:
                mPage4.setVisibility(View.VISIBLE);
                break;
        }
    }
    void ChangeList(int page) {
        yPage1.setVisibility(View.INVISIBLE);
        yPage2.setVisibility(View.INVISIBLE);
        yPage3.setVisibility(View.INVISIBLE);
        yPage4.setVisibility(View.INVISIBLE);

        switch (page) {
        case 1:
            yPage1.setVisibility(View.VISIBLE);
            break;
        case 2:
            yPage2.setVisibility(View.VISIBLE);
            break;
        case 3:
            yPage3.setVisibility(View.VISIBLE);
            break;
        case 4:
            yPage4.setVisibility(View.VISIBLE);
            break;
    }
    }

    public boolean onCreateOptionMenu(Menu menu){
    	MenuInflater Inf = getSupportMenuInflater();
    	return true;
    	}
    }
