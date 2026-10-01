package o;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.AccessDeniedException;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access16000 implements Sequence<File> {
    private final int IAuthTabCallback;
    private final File IAuthTabCallbackStub;
    private final Function1<File, Unit> onExtraCallback;
    private final Function2<File, IOException, Unit> onExtraCallbackWithResult;
    private final Function1<File, Boolean> onNavigationEvent;
    private final FileWalkDirection onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    private access16000(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function12, Function2<? super File, ? super IOException, Unit> function2, int i) {
        this.IAuthTabCallbackStub = file;
        this.onWarmupCompleted = fileWalkDirection;
        this.onNavigationEvent = function1;
        this.onExtraCallback = function12;
        this.onExtraCallbackWithResult = function2;
        this.IAuthTabCallback = i;
    }

    /* synthetic */ access16000(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function12, function2, (i2 & 32) != 0 ? IntCompanionObject.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public access16000(@NotNull File file, @NotNull FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(fileWalkDirection, "");
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<File> IAuthTabCallback() {
        return new onExtraCallback();
    }

    static abstract class IAuthTabCallback {
        private final File onNavigationEvent;

        public abstract File IAuthTabCallback();

        public IAuthTabCallback(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "");
            this.onNavigationEvent = file;
        }

        public final File onExtraCallback() {
            return this.onNavigationEvent;
        }
    }

    static abstract class onWarmupCompleted extends IAuthTabCallback {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull File file) {
            super(file);
            Intrinsics.checkNotNullParameter(file, "");
        }
    }

    final class onExtraCallback extends access6400<File> {
        private final ArrayDeque<IAuthTabCallback> IAuthTabCallback;

        public static final /* synthetic */ class onNavigationEvent {
            public static final /* synthetic */ int[] IAuthTabCallback;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                IAuthTabCallback = iArr;
            }
        }

        public onExtraCallback() {
            ArrayDeque<IAuthTabCallback> arrayDeque = new ArrayDeque<>();
            this.IAuthTabCallback = arrayDeque;
            if (access16000.this.IAuthTabCallbackStub.isDirectory()) {
                arrayDeque.push(onNavigationEvent(access16000.this.IAuthTabCallbackStub));
            } else if (access16000.this.IAuthTabCallbackStub.isFile()) {
                arrayDeque.push(new C0022onExtraCallback(this, access16000.this.IAuthTabCallbackStub));
            } else {
                onExtraCallback();
            }
        }

        @Override // o.access6400
        public void onNavigationEvent() {
            File fileIAuthTabCallback = IAuthTabCallback();
            if (fileIAuthTabCallback != null) {
                onExtraCallback(fileIAuthTabCallback);
            } else {
                onExtraCallback();
            }
        }

        private final onWarmupCompleted onNavigationEvent(File file) {
            int i = onNavigationEvent.IAuthTabCallback[access16000.this.onWarmupCompleted.ordinal()];
            if (i == 1) {
                return new IAuthTabCallback(this, file);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return new onExtraCallbackWithResult(this, file);
        }

        private final File IAuthTabCallback() {
            File fileIAuthTabCallback;
            while (true) {
                IAuthTabCallback iAuthTabCallbackPeek = this.IAuthTabCallback.peek();
                if (iAuthTabCallbackPeek == null) {
                    return null;
                }
                fileIAuthTabCallback = iAuthTabCallbackPeek.IAuthTabCallback();
                if (fileIAuthTabCallback == null) {
                    this.IAuthTabCallback.pop();
                } else {
                    if (Intrinsics.areEqual(fileIAuthTabCallback, iAuthTabCallbackPeek.onExtraCallback()) || !fileIAuthTabCallback.isDirectory() || this.IAuthTabCallback.size() >= access16000.this.IAuthTabCallback) {
                        break;
                    }
                    this.IAuthTabCallback.push(onNavigationEvent(fileIAuthTabCallback));
                }
            }
            return fileIAuthTabCallback;
        }

        final class onExtraCallbackWithResult extends onWarmupCompleted {
            private File[] IAuthTabCallback;
            private boolean onExtraCallback;
            private int onExtraCallbackWithResult;
            final /* synthetic */ onExtraCallback onNavigationEvent;
            private boolean onWarmupCompleted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(@NotNull onExtraCallback onextracallback, File file) {
                super(file);
                Intrinsics.checkNotNullParameter(file, "");
                this.onNavigationEvent = onextracallback;
            }

            @Override // o.access16000.IAuthTabCallback
            public File IAuthTabCallback() {
                if (!this.onExtraCallback && this.IAuthTabCallback == null) {
                    Function1 function1 = access16000.this.onNavigationEvent;
                    if (function1 != null && !((Boolean) function1.invoke(onExtraCallback())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = onExtraCallback().listFiles();
                    this.IAuthTabCallback = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = access16000.this.onExtraCallbackWithResult;
                        if (function2 != null) {
                            function2.invoke(onExtraCallback(), new AccessDeniedException(onExtraCallback(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.onExtraCallback = true;
                    }
                }
                File[] fileArr = this.IAuthTabCallback;
                if (fileArr != null) {
                    int i = this.onExtraCallbackWithResult;
                    Intrinsics.checkNotNull(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.IAuthTabCallback;
                        Intrinsics.checkNotNull(fileArr2);
                        int i2 = this.onExtraCallbackWithResult;
                        this.onExtraCallbackWithResult = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (this.onWarmupCompleted) {
                    Function1 function12 = access16000.this.onExtraCallback;
                    if (function12 != null) {
                        function12.invoke(onExtraCallback());
                    }
                    return null;
                }
                this.onWarmupCompleted = true;
                return onExtraCallback();
            }
        }

        final class IAuthTabCallback extends onWarmupCompleted {
            private boolean IAuthTabCallback;
            final /* synthetic */ onExtraCallback onExtraCallback;
            private File[] onExtraCallbackWithResult;
            private int onNavigationEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IAuthTabCallback(@NotNull onExtraCallback onextracallback, File file) {
                super(file);
                Intrinsics.checkNotNullParameter(file, "");
                this.onExtraCallback = onextracallback;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
            
                if (r0.length == 0) goto L30;
             */
            @Override // o.access16000.IAuthTabCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File IAuthTabCallback() {
                Function2 function2;
                if (!this.IAuthTabCallback) {
                    Function1 function1 = access16000.this.onNavigationEvent;
                    if (function1 != null && !((Boolean) function1.invoke(onExtraCallback())).booleanValue()) {
                        return null;
                    }
                    this.IAuthTabCallback = true;
                    return onExtraCallback();
                }
                File[] fileArr = this.onExtraCallbackWithResult;
                if (fileArr != null) {
                    int i = this.onNavigationEvent;
                    Intrinsics.checkNotNull(fileArr);
                    if (i >= fileArr.length) {
                        Function1 function12 = access16000.this.onExtraCallback;
                        if (function12 != null) {
                            function12.invoke(onExtraCallback());
                        }
                        return null;
                    }
                }
                if (this.onExtraCallbackWithResult == null) {
                    File[] fileArrListFiles = onExtraCallback().listFiles();
                    this.onExtraCallbackWithResult = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = access16000.this.onExtraCallbackWithResult) != null) {
                        function2.invoke(onExtraCallback(), new AccessDeniedException(onExtraCallback(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.onExtraCallbackWithResult;
                    if (fileArr2 != null) {
                        Intrinsics.checkNotNull(fileArr2);
                    }
                    Function1 function13 = access16000.this.onExtraCallback;
                    if (function13 != null) {
                        function13.invoke(onExtraCallback());
                    }
                    return null;
                }
                File[] fileArr3 = this.onExtraCallbackWithResult;
                Intrinsics.checkNotNull(fileArr3);
                int i2 = this.onNavigationEvent;
                this.onNavigationEvent = i2 + 1;
                return fileArr3[i2];
            }
        }

        /* renamed from: o.access16000$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        final class C0022onExtraCallback extends IAuthTabCallback {
            final /* synthetic */ onExtraCallback IAuthTabCallback;
            private boolean onExtraCallbackWithResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0022onExtraCallback(@NotNull onExtraCallback onextracallback, File file) {
                super(file);
                Intrinsics.checkNotNullParameter(file, "");
                this.IAuthTabCallback = onextracallback;
            }

            @Override // o.access16000.IAuthTabCallback
            public File IAuthTabCallback() {
                if (this.onExtraCallbackWithResult) {
                    return null;
                }
                this.onExtraCallbackWithResult = true;
                return onExtraCallback();
            }
        }
    }

    public final access16000 onNavigationEvent(@NotNull Function2<? super File, ? super IOException, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return new access16000(this.IAuthTabCallbackStub, this.onWarmupCompleted, this.onNavigationEvent, this.onExtraCallback, function2, this.IAuthTabCallback);
    }
}
