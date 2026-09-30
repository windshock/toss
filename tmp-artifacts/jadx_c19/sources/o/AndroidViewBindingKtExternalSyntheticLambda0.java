package o;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidViewBindingKtExternalSyntheticLambda0 implements SaversKtExternalSyntheticLambda24<InputStream> {
    private final Savers_androidKtExternalSyntheticLambda6 onNavigationEvent;

    public AndroidViewBindingKtExternalSyntheticLambda0(Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        this.onNavigationEvent = savers_androidKtExternalSyntheticLambda6;
    }

    @Override // o.SaversKtExternalSyntheticLambda24
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public boolean onExtraCallback(@NonNull InputStream inputStream, @NonNull File file, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws Throwable {
        byte[] bArr = (byte[]) this.onNavigationEvent.onExtraCallback(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i2);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.onNavigationEvent.onNavigationEvent((Savers_androidKtExternalSyntheticLambda6) bArr);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    this.onNavigationEvent.onNavigationEvent((Savers_androidKtExternalSyntheticLambda6) bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            this.onNavigationEvent.onNavigationEvent((Savers_androidKtExternalSyntheticLambda6) bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
