package seekbar.studio.com.seekbar;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private SeekBar seekBar;
    private TextView textoMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar)findViewById(R.id.seekBarId);
        textoMensagem = (TextView)findViewById(R.id.textMensagem);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            //cada vez que muda o status do Seek Bar
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textoMensagem.setText("Progresso: " + progress );
            }

            //quando pressiona o seek bar
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek bar pressionado", Toast.LENGTH_SHORT).show();
            }

            //solta seek bar
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek bar NÃO pressionado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
