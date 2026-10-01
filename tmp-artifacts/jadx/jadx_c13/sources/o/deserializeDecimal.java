package o;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class deserializeDecimal extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    @Override // java.lang.Throwable
    public void printStackTrace() {
    }

    public deserializeDecimal(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    public deserializeDecimal(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof deserializeDecimal) {
                    linkedHashSet.addAll(((deserializeDecimal) th).IAuthTabCallback());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.exceptions = listUnmodifiableList;
        this.message = listUnmodifiableList.size() + " exceptions occurred. ";
    }

    public List<Throwable> IAuthTabCallback() {
        return this.exceptions;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        Throwable th;
        synchronized (this) {
            if (this.cause == null) {
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.exceptions.iterator();
                Throwable thOnNavigationEvent = onextracallbackwithresult;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        for (Throwable th2 : onExtraCallback(next)) {
                            if (hashSet.contains(th2)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            thOnNavigationEvent.initCause(next);
                        } catch (Throwable unused) {
                        }
                        thOnNavigationEvent = onNavigationEvent(thOnNavigationEvent);
                    }
                }
                this.cause = onextracallbackwithresult;
            }
            th = this.cause;
        }
        return th;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        IAuthTabCallback(new onExtraCallback(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        IAuthTabCallback(new IAuthTabCallback(printWriter));
    }

    private void IAuthTabCallback(onWarmupCompleted onwarmupcompleted) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            IAuthTabCallback(sb, th, "\t");
            i++;
        }
        onwarmupcompleted.onExtraCallbackWithResult(sb.toString());
    }

    private void IAuthTabCallback(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            IAuthTabCallback(sb, th.getCause(), _UrlKt.FRAGMENT_ENCODE_SET);
        }
    }

    static abstract class onWarmupCompleted {
        abstract void onExtraCallbackWithResult(Object obj);

        onWarmupCompleted() {
        }
    }

    static final class onExtraCallback extends onWarmupCompleted {
        private final PrintStream onExtraCallback;

        onExtraCallback(PrintStream printStream) {
            this.onExtraCallback = printStream;
        }

        @Override // o.deserializeDecimal.onWarmupCompleted
        void onExtraCallbackWithResult(Object obj) {
            this.onExtraCallback.println(obj);
        }
    }

    static final class IAuthTabCallback extends onWarmupCompleted {
        private final PrintWriter onNavigationEvent;

        IAuthTabCallback(PrintWriter printWriter) {
            this.onNavigationEvent = printWriter;
        }

        @Override // o.deserializeDecimal.onWarmupCompleted
        void onExtraCallbackWithResult(Object obj) {
            this.onNavigationEvent.println(obj);
        }
    }

    static final class onExtraCallbackWithResult extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        onExtraCallbackWithResult() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    private List<Throwable> onExtraCallback(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    Throwable onNavigationEvent(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }
}
