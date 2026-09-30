package o;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda7 extends Exception {
    private static final StackTraceElement[] onNavigationEvent = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private SaversKtExternalSyntheticLambda21 dataSource;
    private String detailMessage;
    private Exception exception;
    private SaversKtExternalSyntheticLambda26 key;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
    }

    public SaversKtExternalSyntheticLambda7(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    public SaversKtExternalSyntheticLambda7(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public SaversKtExternalSyntheticLambda7(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(onNavigationEvent);
        this.causes = list;
    }

    void onExtraCallbackWithResult(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21) {
        onNavigationEvent(saversKtExternalSyntheticLambda26, saversKtExternalSyntheticLambda21, null);
    }

    void onNavigationEvent(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, Class<?> cls) {
        this.key = saversKtExternalSyntheticLambda26;
        this.dataSource = saversKtExternalSyntheticLambda21;
        this.dataClass = cls;
    }

    public void IAuthTabCallback(@Nullable Exception exc) {
        this.exception = exc;
    }

    public List<Throwable> IAuthTabCallback() {
        return this.causes;
    }

    public List<Throwable> onExtraCallbackWithResult() {
        ArrayList arrayList = new ArrayList();
        onExtraCallbackWithResult(this, arrayList);
        return arrayList;
    }

    public void onNavigationEvent(String str) {
        List<Throwable> listOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int size = listOnExtraCallbackWithResult.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            listOnExtraCallbackWithResult.get(i2);
            i2 = i3;
        }
    }

    private void onExtraCallbackWithResult(Throwable th, List<Throwable> list) {
        if (th instanceof SaversKtExternalSyntheticLambda7) {
            Iterator<Throwable> it = ((SaversKtExternalSyntheticLambda7) th).IAuthTabCallback().iterator();
            while (it.hasNext()) {
                onExtraCallbackWithResult(it.next(), list);
            }
            return;
        }
        list.add(th);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) throws IOException {
        IAuthTabCallback(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        IAuthTabCallback(printWriter);
    }

    private void IAuthTabCallback(Appendable appendable) throws IOException {
        onNavigationEvent(this, appendable);
        onNavigationEvent(IAuthTabCallback(), new onExtraCallback(appendable));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        sb.append(this.dataClass != null ? ", " + this.dataClass : "");
        sb.append(this.dataSource != null ? ", " + this.dataSource : "");
        sb.append(this.key != null ? ", " + this.key : "");
        List<Throwable> listOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (listOnExtraCallbackWithResult.isEmpty()) {
            return sb.toString();
        }
        if (listOnExtraCallbackWithResult.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listOnExtraCallbackWithResult.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listOnExtraCallbackWithResult) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    private static void onNavigationEvent(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private static void onNavigationEvent(List<Throwable> list, Appendable appendable) {
        try {
            onExtraCallbackWithResult(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void onExtraCallbackWithResult(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof SaversKtExternalSyntheticLambda7) {
                ((SaversKtExternalSyntheticLambda7) th).IAuthTabCallback(appendable);
            } else {
                onNavigationEvent(th, appendable);
            }
            i2 = i3;
        }
    }

    static final class onExtraCallback implements Appendable {
        private final Appendable IAuthTabCallback;
        private boolean onWarmupCompleted = true;

        onExtraCallback(Appendable appendable) {
            this.IAuthTabCallback = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.onWarmupCompleted) {
                this.onWarmupCompleted = false;
                this.IAuthTabCallback.append("  ");
            }
            this.onWarmupCompleted = c == '\n';
            this.IAuthTabCallback.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence) throws IOException {
            CharSequence charSequenceOnWarmupCompleted = onWarmupCompleted(charSequence);
            return append(charSequenceOnWarmupCompleted, 0, charSequenceOnWarmupCompleted.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence, int i2, int i3) throws IOException {
            CharSequence charSequenceOnWarmupCompleted = onWarmupCompleted(charSequence);
            boolean z = false;
            if (this.onWarmupCompleted) {
                this.onWarmupCompleted = false;
                this.IAuthTabCallback.append("  ");
            }
            if (charSequenceOnWarmupCompleted.length() > 0 && charSequenceOnWarmupCompleted.charAt(i3 - 1) == '\n') {
                z = true;
            }
            this.onWarmupCompleted = z;
            this.IAuthTabCallback.append(charSequenceOnWarmupCompleted, i2, i3);
            return this;
        }

        private CharSequence onWarmupCompleted(@Nullable CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }
    }
}
