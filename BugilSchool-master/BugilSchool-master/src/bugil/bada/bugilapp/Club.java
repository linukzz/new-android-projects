package bugil.bada.bugilapp;

import bugil.bada.bugilapp.R;

import java.util.ArrayList;
import java.util.HashMap;

import com.actionbarsherlock.app.SherlockListActivity;
import com.actionbarsherlock.view.MenuInflater;
import android.os.Bundle;
import android.view.Menu;
import android.widget.SimpleAdapter;



public class Club extends SherlockListActivity {
HashMap<String,String> item;
ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        //item�� �� �ֱ�
		item = new HashMap<String,String>();
	    item.put("title","Bada(�۰��ߵ��Ƹ�)");
	    item.put("intro", "JAVA���� XML�� �̿��� �ȵ���̵� �� ���� �� ���α׷����� ���� ������� ����");
		list.add(item);
        item = new HashMap<String,String>();
        item.put("title","BTTC");
		item.put("intro", "Ź���� ���� ���߷���� �� ��Ʈ���� �ؼ�, �ǰ������� �������� �.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","���� ���ɽ�Ʈ��");
		item.put("intro", "���ο���, ���������ֿ���, ���� ��������, ���� �� �ҿܰ����� ������� ã�ư��� ����ȸ ����.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","UDS");
		item.put("intro", "������, ȭ�к�, ������кη� �����Ǿ� ������ �� �μ��� ����� �� �о߸� �����ϴ� �л����� �θ� �̷�� �ְ� �ο��� 2�� �̾� �ٽ� ���� �������� ����� �� ���� ������ ���� �� ������ ���� ������, ȭ����, ������������� Ž���� �����ϰ� ��ǥ�ϴ� Ȱ���� ��. ���հ��� Ȱ���� ���� �� ������ ���� ������, ȭ����, ��������� ������ �Ծ�.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","������");
		item.put("intro", "�����ٴ� ���ǵ��Ƹ���, ���� �����ִ� �о߿� ���� ������ �ϳ� ��Ƽ� �ڽŸ��� å�� ����� �����ϴ� ���� ��ǥ�� ��.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","MES");
		item.put("intro", "���а� ���� �����ִ� �л����� �� ���ο� ������ �� ���� ����� ������ �� �������� �ϱ� ���� ������.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","ELSE");
		item.put("intro", "��/ ���� �м� ���Ƹ�. Tesset �� ��ô�ȸ, ���� ���� �غ�.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","RED");
		item.put("intro", "ȯ�� ������ ���� ���Ľ���, õ�� ������ �����, ȯ�� UCC ����, ȯ�� ����.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","Highway");
		item.put("intro", "������д�ȸ, �����м� ���Ƹ� ���� ����Ȱ��, ��ȸ�� ���� �м�Ȱ��, ����Ž��Ȱ��.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","���ϻ�ȸ���Ƹ�(Highway)");
		item.put("intro", "������д�ȸ, �����м����Ƹ� ��������Ȱ��, ��ȸ�� ���� �м�Ȱ��, ����Ž��Ȱ��");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","AIR");
		item.put("intro", "�ϻ��Ȱ���� ���� ����ϴ� ���ǵ��� â������ �������� ��ȭ��Ű�� �߸��� ���� â�Ƿ� ����� �����ϰ� �߸� ���̵� ���� �����ϰ� ������ ����� �����ϴ� �������� ����.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","�ų븮");
		item.put("intro", "ǳ�� ���Ƹ�. '�ų��� ��� �츮��'�� ���Ӹ�. ������ ǳ�� ����, ��� ��� ����Ȱ�� ���� ��.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","SYNERGY");
		item.put("intro", "����(��,ȭ,��,��)�� ������ ���� ������ ������ �������� ��ȸ �ӿ��� �ó��� ȿ���� ���ڴٴ� ���θ� ������ ���۵� ������, �ǡ����ко߷� �����ϰ��� �ϴ� �л����� �� ������ �����ϰ�, ���� ������ �����ϰ� Ž��, ���������ν� ����ִ� ������ ���ϴ� ���Ƹ�.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","FOCUS");
		item.put("intro", "���� ����� �̷� ����, ���Ȱ������ ��ǰ���� �� ��� ����.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","BEC");
		item.put("intro", "�濵, ������ ������ ���� �л����� �ڹ����� �н� �� ��ǥ ����.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","BRC");
		item.put("intro", "����� �� � ���������� ���̶�� �ܾ ���� Ȯ���� ��Ÿ �� �� ������, ���ǰ� �ִ� �������� ���� ���԰� ���� �� ��� ���ѵ� ���� ��ΰ� �� �� �ִ� ������.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","IB");
		item.put("intro", "1,2�г� �л���� ������ �б� ȫ�� ���Ƹ�\n1) ���� ����ȸ �غ� �� ����\n2) ���� ȫ���� å�� �� ������(UCC) ����\n3) �Խ� ��� ���� ī�� ���� \n4) �б� ȫ�� �� ");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","GQ");
        item.put("intro", "���� �̼���ǰ ���� ����ȸ, �̼����� ����Ž��Ȱ��, �������� ��ǰ����ȸ");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","Amond");
		item.put("intro", "��ȭ����(���� �Ǵ� ����) �� �Ұ� ��ǥ �� ���, ����� ����");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","Astro");
        item.put("intro", "�¾�, ��, �༺, ����, ����, ���� �� õü ������ õ���� ����, õ�� ���� Ž�� Ȱ��, ���� ���� ��");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","ME&RAE");
		item.put("intro", "���ко� �оߺ� Ž�� �� ���� ���� ����");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","JMP");
		item.put("intro", "Jebal Murly Pogihajima(���� ���� ����������)�� ���ڷ� ������ �����ϴ� �л����� ������ �����ش޶�� ���� ������ ����ִ� ���ϰ� ������ �л� ���� ���Ƹ��̸� �پ��� MBL ���� ���� ���� �̿��Ͽ� �����ϰ� ��Ȯ�� �������� ������Ģ�� ������ �����ϰ� �̷��� ���θ� �Ƿ����� �׾� �÷� ���� ������ �پ��� ��ȸ � ������.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","����Ʈ");
		item.put("intro", "ü������ ���̰� �������� �÷� �������� ��ü�� ���� �ڽŰ��� Ű���.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","BFC");
		item.put("intro", "�౸����, Ư����� ����, �����Ʒ� ���� ���Ƹ� Ȱ���� ���� ���������� �౸�� ���õ� ����̳� ������ �Ծ��ϰ� ���ư� ����ü�°���, ������, �ܰ��, ���������� ���� ���� �������� ������ ������ ��ǥ�� ��.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","������");
		item.put("intro", "Ŭ���� ��Ÿ ���Ƹ��μ� ��Ÿ���ָ� ����, �����ϴ� �Ϳ� �ָ����� �θ� �ָ����� ��Ÿ���ָ� ���� ��ɱ�� ����Ȱ���� ��õ��.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","EOS");
		item.put("intro", "���߰��� �θ���, ���߰����� â�� ������, ���Ƹ� ��ǥȸ");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","ƼŰŸī");
		item.put("intro", "ǲ���� ���Ͽ� ��ü�� �ܷ��ϰ� �п�鰣�� �������� �⸣�� ����Ƹ�");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","BBC");
        item.put("intro", "���� �ְ��� �߱��Ƿ��� �ڶ��ϴ� ���ϰ��� ���� �Ƹ��߾� �л��߱� ���Ƹ��̸�, �� 1ȸ ���ɽð��� �̿��� �����ϰ�, �� 1,2ȸ ���Ƹ� Ȱ���ð��� ���� �� ������� �ǽ�, �� 4ȸ���� �������� ģ����⳪ Ÿ�б����� ģ����� ����");
        list.add(item);
        item = new HashMap<String,String>();
        item.put("title","BIMIL");
		item.put("intro", "���ϰ���б� ������ BIMIL�� �������, ������Ʈ������ ����, �ҳ� �ۼ� ���� ���� Ȱ���� �ϰ� ������, ���� Ȱ�� �ܿ� �νǷ� ����ϴ� ������ ���� �� ��� ���� �ִ�.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","BBS");
		item.put("intro", "��۱�� �ٷ��, UCC �����ȸ ����, ��۰��� ����Ž��, �б��������");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","Ʈ��Ŀ");
		item.put("intro", "���� ������ �����ϴ� ���� �ƴ����� ������ �����ϴ� ������� �޽����̴�. ���� �⶧�� ��ſ�� ģ������� ����, ������ ���� ǥ���� �ϰ� ������ ������ ģ������ ���� ���Ƹ��̴�. �츰 Ʈ��Ŀ����!!!");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","�����");
		item.put("intro", "���ϰ� ��� ���Ƹ� ������� ��� ���� ���� �Ӹ� �ƴ϶� ��ɺ��縦 ���� Ʈ��Ʈ, ���� ������ �߿� ������ ���� ����ƽ ����, �ܵ� �ܼ�Ʈ ���� �� �پ��� ������ Ȱ���� ���� �������� ����ũ ������ ���� �б���Ȱ�� ���� �ǹ��ְ� ����� ����.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","������");
        item.put("intro", "�� ���� ��� �л��鿡�� ����� ������ ��ȸ�� �־����� �Ѵ�.����� ���ΰ�����  ��ɱ�������� ���� ���縦 �����ϰ� �ִ�. ���丵 ����Ȱ���� õ���� �������� �žƿ��� �������ƿ����� ���� �ǰ� �ִ�.  ���丵 ��������� �Ѹ��� ����� �Ѹ��� ��Ƽ�� �����Ǿ� 1�Ⱓ �ֱ������� 1:1 ���丵 Ȱ���� �����ϰ� �ִ�.  ���䰡 �ڽ��� ��Ƽ�� �о��� �����ִ� ���� �ֿ�Ȱ���̸� �ܼ� ���� Ȱ���� �ƴ� �ڽ��� ��Ƽ�� ���� ���, ���� ��� �� �پ��� ����Ȱ���� �ϸ� ������ �ǹ��� ��� ���縦 �����ϰ� ������ ���� ����(positive comment)��� ���������� ȫ���Ͽ� ������ ���ͳ� ��ȭ Ȯ���� ���� ������ �ִ�.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","��ǻ��");
		item.put("intro", "������ ����, ������ ���Ͽ� ������ �б� ��Ȱ�� ����� ���絿�Ƹ�.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","���¿�");
		item.put("intro", "��� �� ��ü ǥ�� ����� ��ȭ�� ���Ͽ� ��������â���� �н� �ɷ��� �����ϰ� �ϸ�, ���� ������ ���� ���븦 �غ��ϴ� Ȱ���� ���Ͽ� â�Ƿ°� ������ �����ϰ�, ���� ���Ű� ����ü �ǽ��� �Ծ��ϰ� ��.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","SKT");
		item.put("intro", "������ ���Ľ���, �Ƶ����Ϳ� ���б����н��� ����Ȱ��, ���� ��ô�ȸ �غ� �� ����");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","Flyer");
		item.put("intro", "������ �������� �� ���α�� �� ������ ����� �Բ� ���� �󱸴�ȸ�� �����ϰ� �̸� ���� ��ȭ�ο� ����ũ�� ���� �ǹ̸� ã�� ���Ƹ�.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","�ָ��� �Ƿ����");
		item.put("intro", "ģ������ �ٰ�����, ��ȭ�ϴ� ģ���Ǳ�, �����ִ� ģ���Ǳ�");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","EMU HAPPY");
		item.put("intro", "������� �ۼ� �� ���ڽŹ� �߰�, �Ź��� �ø� ������ �ۼ� �� �Ź���縦 ���� �����Ͽ� ����.");
		list.add(item);
		item = new HashMap<String,String>();
        item.put("title","����������");
		item.put("intro", "õ�� ���� ��忡�� �ζ��ν�����Ʈ�� ������ �����Ͽ� ü�� ������ �������� �.");
		list.add(item);

		//item�� �����ߴ� ���� list-Adapter�� ���<title�� text1��, intro�� text2��>
        SimpleAdapter aaa = new SimpleAdapter(this, list, android.R.layout.simple_list_item_2, 
                new String[] {"title","intro"}, 
                new int[] {android.R.id.text1, android.R.id.text2});
        setListAdapter(aaa);


        
    }
    public boolean onCreateOptionMenu(Menu menu){
    	MenuInflater Inf = getSupportMenuInflater();
    	return true;
    	}


}
