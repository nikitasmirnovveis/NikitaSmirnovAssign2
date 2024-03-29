//Nikita Smirnov n01287334 RNB
package nikita.smirnov.n01287334;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class smirnovActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smirnov_second);
        //Listview flats = R.id.flatlist;
        //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.ListView,StringArray);
        ListView flatlist = (ListView) findViewById(R.id.nikitaflatlist);
        flatlist.setVisibility(View.GONE);
        ListView detachedlist = (ListView) findViewById(R.id.nikitadetachedlist);
        detachedlist.setVisibility(View.GONE);
        ListView semilist = (ListView) findViewById(R.id.nikitasemilist);
        semilist.setVisibility(View.GONE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.your_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nikitaflat: {
                //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.ListView,StringArray);
                //listview.setVisibility(View.GONE);

                //listview.setVisibility(View.INVISIBLE);
                //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.ListView,StringArray);
                ListView flatlist = (ListView) findViewById(R.id.nikitaflatlist);
                flatlist.setVisibility(View.VISIBLE);
                //Perform your click operation
                break;
            }
            case R.id.nikitadetached: {
                //Perform your click operation
                break;
            }
            case R.id.nikitasemi: {
                //Perform your click operation
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }

//    private class MyAdapter extends BaseAdapter {
//
//        // override other abstract methods here
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup container) {
//            if (convertView == null) {
//                convertView = getLayoutInflater().inflate(R.layout.list_item, container, false);
//            }
//
//            ((TextView) convertView.findViewById(android.R.id.text1))
//                    .setText(getItem(position));
//            return convertView;
//        }
//    }

}