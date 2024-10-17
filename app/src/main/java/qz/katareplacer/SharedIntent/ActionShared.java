package qz.katareplacer.SharedIntent;

import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import qz.katareplacer.utils.KataReplacer;
import qz.katareplacer.utils.ProfilMap;

/**
 * ActionShared
 */
public class ActionShared extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    // TODO Auto-generated method stub
    super.onCreate(savedInstanceState);
    var text = getIntent().getCharSequenceExtra(Intent.EXTRA_PROCESS_TEXT);
    var readOnly = getIntent().getBooleanExtra(Intent.EXTRA_PROCESS_TEXT_READONLY, false);
    if (text != null && !readOnly) {
      ProfilMap defaultSettings = new ProfilMap();
      setResult(Activity.RESULT_OK,
          new Intent().putExtra(
              Intent.EXTRA_PROCESS_TEXT,
              KataReplacer.generator(
                  text.toString(),
                  defaultSettings.DefaultSettings())));
    }
    finish();
  }
}
