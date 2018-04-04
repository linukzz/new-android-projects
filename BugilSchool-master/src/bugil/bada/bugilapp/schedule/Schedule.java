package bugil.bada.bugilapp.schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import bugil.bada.bugilapp.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.tistory.whdghks913.croutonhelper.CroutonHelper;

import de.keyboardsurfer.android.widget.crouton.Style;

public class Schedule extends Activity {

	private ArrayList<Item> mItem = new ArrayList<Item>();
	private ListView mListview;
	private CroutonHelper mHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.schedule_listview);

		mListview = (ListView) findViewById(R.id.mListView);
		mListview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> av, View view, int position,
					long ld) {
				EntryItem mEntryItem = (EntryItem) mItem.get(position);
				SimpleDateFormat sdFormat = new SimpleDateFormat(
						"yyyy.MM.dd (E)", Locale.KOREA);
				Calendar mCalendar = Calendar.getInstance();

				try {
					mCalendar.setTime(sdFormat.parse(mEntryItem.mSummary));
				} catch (ParseException e) {
					e.printStackTrace();
				}

				getTime(mCalendar.get(Calendar.YEAR),
						mCalendar.get(Calendar.MONTH),
						mCalendar.get(Calendar.DAY_OF_MONTH));
			}
		});

		
		mItem.add(new SectionItem("2015�� 3�� ����"));
		mItem.add(new EntryItem("���н�", "2015.03.02 (��)"));
		mItem.add(new EntryItem("���������з���(���г�)", "2015.03.11 (��)"));
		mItem.add(new EntryItem("�ӽÿܹ�(~15)", "2015.03.12 (��)", true));
		mItem.add(new EntryItem("1�б� ����� ��û/��������� �޹�", "2015.03.13 (��)"));
		mItem.add(new EntryItem("�кθ� ����ְ�(~27)", "2015.03.23 (��)"));
		mItem.add(new EntryItem("�кθ���ȸ/����ܹ�", "2015.03.27 (��)", true));

		mItem.add(new SectionItem("2015�� 4�� ����"));
		mItem.add(new EntryItem("���������з���(3�г�)", "2015.04.09 (��)"));
		mItem.add(new EntryItem("������(�б� ������ ��)", "2015.04.11 (��)", true));
		mItem.add(new EntryItem("�кθ����۷���/����ܹ�", "2015.04.09 (��)", true));

		mItem.add(new SectionItem("2015�� 5�� ����"));
		mItem.add(new EntryItem("1ȸ���(���г�)", "2015.05.04 (��)"));
		mItem.add(new EntryItem("1ȸ���(���г�)", "2015.05.06 (��)"));
		mItem.add(new EntryItem("1ȸ���(���г�)", "2015.05.07 (��)"));
		mItem.add(new EntryItem("���������Ծ����α׷�", "2015.05.08 (��)"));
		mItem.add(new EntryItem("ü����ȸ/����ܹ�", "2015.05.22 (��)", true));
		mItem.add(new EntryItem("1�� �б� ����ȸ", "2015.05.30 (��)"));

		mItem.add(new SectionItem("2015�� 6�� ����"));
		mItem.add(new EntryItem("���������з���(1,2�г�)/����ɸ�����(3�г�)", "2015.06.04 (��)"));
		mItem.add(new EntryItem("�о����뵵��(2�г�)", "2015.06.24 (��)"));
		mItem.add(new EntryItem("���������Ⱓ(~26)", "2015.06.25 (��)"));
		mItem.add(new EntryItem("����ܹ�", "2015.06.26 (��)", true));
		mItem.add(new EntryItem("�ϰ� ����� ��û", "2015.06.27 (��)"));
		
		mItem.add(new SectionItem("2015�� 7�� ����"));
		mItem.add(new EntryItem("���������з���(3�г�)", "2015.07.09 (��)"));
		mItem.add(new EntryItem("2ȸ���(���г�)", "2015.07.10 (��)"));
		mItem.add(new EntryItem("2ȸ���(���г�)", "2015.07.13 (��)"));
		mItem.add(new EntryItem("2ȸ���(���г�)", "2015.07.14 (ȭ)"));
		mItem.add(new EntryItem("�ϰ���н�", "2015.07.17 (��)", true));
		mItem.add(new EntryItem("2�� �б�����ȸ/2�б� ����� ��û", "2015.07.18 (��)"));
		mItem.add(new EntryItem("�ϰ� ������б�(~8/7)", "2015.07.27 (��)"));
		
		mItem.add(new SectionItem("2015�� 8�� ����"));
		mItem.add(new EntryItem("����/�кθ� ����ְ�(~28)", "2015.08.17 (��)"));
		mItem.add(new EntryItem("1ȸ���(3�г�)", "2015.08.19 (��)"));
		mItem.add(new EntryItem("1ȸ���(3�г�)", "2015.08.20 (��)"));
		mItem.add(new EntryItem("1ȸ���(3�г�)", "2015.08.21 (��)"));
		mItem.add(new EntryItem("3�� �б�����ȸ", "2015.08.22 (��)"));
		
		mItem.add(new SectionItem("2015�� 9�� ����"));
		mItem.add(new EntryItem("���������з���(1,2�г�)/����ɸ�����(3�г�)", "2015.09.02 (��)"));
		mItem.add(new EntryItem("�кθ����۷���", "2015.09.05 (��)"));
		mItem.add(new EntryItem("4�� �б�����ȸ", "2015.09.12 (��)"));
		mItem.add(new EntryItem("���������Ⱓ(~25)", "2015.09.24 (��)"));
		mItem.add(new EntryItem("����ܹ�", "2015.09.25 (��)", true));
		mItem.add(new EntryItem("�߼�����", "2015.09.26 (��)", true));
		mItem.add(new EntryItem("�߼�����", "2015.09.27 (��)", true));
		mItem.add(new EntryItem("�߼�����", "2015.09.28 (��)", true));
		mItem.add(new EntryItem("��ü����", "2015.09.29 (ȭ)", true));
		
		mItem.add(new SectionItem("2015�� 10�� ����"));
		mItem.add(new EntryItem("5�� �б�����ȸ", "2015.10.03 (��)"));
		mItem.add(new EntryItem("1ȸ���(1,2�г�)", "2015.10.06 (��)"));
		mItem.add(new EntryItem("1ȸ���(1,2�г�)", "2015.10.07 (ȭ)"));
		mItem.add(new EntryItem("1ȸ���(1,2�г�)", "2015.10.08 (��)"));
		mItem.add(new EntryItem("���������Ծ����α׷�", "2015.10.09 (��)"));
		mItem.add(new EntryItem("���������з���(3�г�)", "2015.10.13 (ȭ)"));
		mItem.add(new EntryItem("����ܹ�", "2015.10.28 (��)", true));
		mItem.add(new EntryItem("�緮�޾�(1,2�г�)", "2015.10.29 (��)", true));
		mItem.add(new EntryItem("�緮�޾�(1,2�г�)", "2015.10.30 (��)", true));
		
		mItem.add(new SectionItem("2015�� 11�� ����"));
		mItem.add(new EntryItem("�緮�޾�(1,2�г�)", "2015.11.02 (��)", true));
		mItem.add(new EntryItem("2016 ���Լ��ɽ���", "2015.11.12 (��)"));
		mItem.add(new EntryItem("2ȸ���(3�г�)", "2015.11.16 (��)"));
		mItem.add(new EntryItem("���������з���(1,2�г�)/2ȸ���(3�г�)", "2015.11.17 (ȭ)"));
		mItem.add(new EntryItem("2ȸ���(3�г�)", "2015.11.18 (��)"));
		mItem.add(new EntryItem("�м�������", "2015.11.26 (��)"));
		mItem.add(new EntryItem("�м�������/����ܹ�", "2015.11.27 (��)", true));
		mItem.add(new EntryItem("�������� ��û", "2015.11.28 (��)"));
		
		mItem.add(new SectionItem("2015�� 12�� ����"));
		mItem.add(new EntryItem("����/�кθ� ����ְ�(~28)", "2015.08.17 (��)"));
		mItem.add(new EntryItem("2ȸ���(1,2�г�)", "2015.12.21 (��)"));
		mItem.add(new EntryItem("2ȸ���(1,2�г�)", "2015.12.22 (ȭ)"));
		mItem.add(new EntryItem("2ȸ���(1,2�г�)", "2015.12.23 (��)"));
		mItem.add(new EntryItem("���н�(3�г�)", "2015.12.24 (��)", true));
		mItem.add(new EntryItem("���н�(1,2�г�)", "2015.12.30 (��)", true));
		

		EntryAdapter adapter = new EntryAdapter(this, mItem);
		mListview.setAdapter(adapter);

		mHelper = new CroutonHelper(this);
	}

	private void getTime(int year, int month, int day) {
		Calendar myTime = Calendar.getInstance();

		long nowTime = myTime.getTimeInMillis();
		myTime.set(year, month, day);
		long touchTime = myTime.getTimeInMillis();

		long diff = (touchTime - nowTime);

		boolean isPast = false;
		if (diff < 0) {
			diff = -diff;
			isPast = true;
		}

		int diffInt = (int) (diff /= 24 * 60 * 60 * 1000);

		String Text;
		if (isPast)
			Text = "�����Ͻ� ��¥�� " + diffInt + "���� ��¥�Դϴ�";
		else
			Text = "�����Ͻ� ��¥���� " + diffInt + "�� ���ҽ��ϴ�";

		mHelper.clearCroutonsForActivity();
		mHelper.setText(Text);
		mHelper.setStyle(Style.INFO);
		mHelper.show();
	}

	public interface Item {
		public boolean isSection();
	}
}