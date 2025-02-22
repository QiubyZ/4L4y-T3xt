package qz.katareplacer;

import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import qz.katareplacer.databinding.ActivityMainBinding;
import qz.katareplacer.utils.KataReplacer;
import qz.katareplacer.utils.ProfilMap;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate and get instance of binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        
        // set content view to binding's root
        setContentView(binding.getRoot());

        binding.text.addTextChangedListener(
                new TextWatcher() {

                    @Override
                    public void beforeTextChanged(
                            CharSequence arg0, int arg1, int arg2, int arg3) {

                    }

                    @Override
                    public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                        // String kata = KataReplacer.generator(arg0.toString(), new ProfilMap().DefaultSettings());
                        // binding.result.setText(kata);
                        
                        String kata = KataReplacer.generatorStringBuilder(arg0.toString(), new ProfilMap().DefaultSettings());
                        
                        binding.result.setText(kata.toString());
                    }

                    @Override
                    public void afterTextChanged(Editable arg0) {

                    }
                });

        binding.copy.setOnClickListener((v) -> copyText(binding.result.getText().toString()));
        binding.clear.setOnClickListener((v) -> binding.text.setText(""));

    }

    void copyText(String s) {
        ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        cm.setText(s);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}
