package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTHistoryLandingPageActivity101 {

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TTHistoryLandingPageActivity101.onWarmupCompleted(null, null, null, null, false, false, this);
        }
    }

    public static final TTBaseVideoActivity IAuthTabCallback(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        TTBaseVideoActivity tTBaseVideoActivityMetadataOrNull = fileSystem.metadataOrNull(tTFullScreenVideoActivity3);
        if (tTBaseVideoActivityMetadataOrNull != null) {
            return tTBaseVideoActivityMetadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + tTFullScreenVideoActivity3);
    }

    public static final boolean onNavigationEvent(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return fileSystem.metadataOrNull(tTFullScreenVideoActivity3) != null;
    }

    public static final void onNavigationEvent(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        access6900 access6900Var = new access6900();
        for (TTFullScreenVideoActivity3 tTFullScreenVideoActivity3IAuthTabCallbackStub = tTFullScreenVideoActivity3; tTFullScreenVideoActivity3IAuthTabCallbackStub != null && !fileSystem.exists(tTFullScreenVideoActivity3IAuthTabCallbackStub); tTFullScreenVideoActivity3IAuthTabCallbackStub = tTFullScreenVideoActivity3IAuthTabCallbackStub.IAuthTabCallbackStub()) {
            access6900Var.addFirst(tTFullScreenVideoActivity3IAuthTabCallbackStub);
        }
        if (z && access6900Var.isEmpty()) {
            throw new IOException(tTFullScreenVideoActivity3 + " already exists.");
        }
        Iterator<E> it = access6900Var.iterator();
        while (it.hasNext()) {
            FileSystem.createDirectory$default(fileSystem, (TTFullScreenVideoActivity3) it.next(), false, 2, null);
        }
    }

    static final class IAuthTabCallback extends RestrictedSuspendLambda implements Function2<clearCommandLine<? super TTFullScreenVideoActivity3>, access13800<? super Unit>, Object> {
        final /* synthetic */ TTFullScreenVideoActivity3 $fileOrDirectory;
        final /* synthetic */ FileSystem $this_commonDeleteRecursively;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(FileSystem fileSystem, TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$this_commonDeleteRecursively = fileSystem;
            this.$fileOrDirectory = tTFullScreenVideoActivity3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$this_commonDeleteRecursively, this.$fileOrDirectory, access13800Var);
            iAuthTabCallback.L$0 = obj;
            return iAuthTabCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(clearCommandLine<? super TTFullScreenVideoActivity3> clearcommandline, access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallback) create(clearcommandline, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            clearCommandLine clearcommandline = (clearCommandLine) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                FileSystem fileSystem = this.$this_commonDeleteRecursively;
                access6900 access6900Var = new access6900();
                TTFullScreenVideoActivity3 tTFullScreenVideoActivity3 = this.$fileOrDirectory;
                this.L$0 = access15400.onNavigationEvent(clearcommandline);
                this.label = 1;
                if (TTHistoryLandingPageActivity101.onWarmupCompleted(clearcommandline, fileSystem, access6900Var, tTFullScreenVideoActivity3, false, true, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void IAuthTabCallback(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Iterator itIAuthTabCallback = clearSignalInfo.onNavigationEvent(new IAuthTabCallback(fileSystem, tTFullScreenVideoActivity3, null)).IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            fileSystem.delete((TTFullScreenVideoActivity3) itIAuthTabCallback.next(), z && !itIAuthTabCallback.hasNext());
        }
    }

    static final class onExtraCallback extends RestrictedSuspendLambda implements Function2<clearCommandLine<? super TTFullScreenVideoActivity3>, access13800<? super Unit>, Object> {
        final /* synthetic */ TTFullScreenVideoActivity3 $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, FileSystem fileSystem, boolean z, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$dir = tTFullScreenVideoActivity3;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onExtraCallback onextracallback = new onExtraCallback(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, access13800Var);
            onextracallback.L$0 = obj;
            return onextracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(clearCommandLine<? super TTFullScreenVideoActivity3> clearcommandline, access13800<? super Unit> access13800Var) {
            return ((onExtraCallback) create(clearcommandline, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            access6900 access6900Var;
            Iterator<TTFullScreenVideoActivity3> it;
            clearCommandLine clearcommandline = (clearCommandLine) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                access6900Var = new access6900();
                access6900Var.addLast(this.$dir);
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                access6900Var = (access6900) this.L$1;
                ResultKt.onNavigationEvent(obj);
            }
            Iterator<TTFullScreenVideoActivity3> it2 = it;
            access6900 access6900Var2 = access6900Var;
            while (it2.hasNext()) {
                TTFullScreenVideoActivity3 next = it2.next();
                FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z = this.$followSymlinks;
                this.L$0 = clearcommandline;
                this.L$1 = access6900Var2;
                this.L$2 = it2;
                this.L$3 = access15400.onNavigationEvent(next);
                this.label = 1;
                if (TTHistoryLandingPageActivity101.onWarmupCompleted(clearcommandline, fileSystem, access6900Var2, next, z, false, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final Sequence<TTFullScreenVideoActivity3> onExtraCallback(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        return clearSignalInfo.onNavigationEvent(new onExtraCallback(tTFullScreenVideoActivity3, fileSystem, z, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        if (r18.onNavigationEvent(r1, r4) != r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0107, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0109, code lost:
    
        if (r11 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        r6.addLast(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0112, code lost:
    
        r14 = r10;
        r10 = r3;
        r16 = r2;
        r2 = r0;
        r0 = r11;
        r11 = r1;
        r1 = r16;
        r17 = r12;
        r12 = r6;
        r6 = r3.iterator();
        r13 = r9;
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0172, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0173, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ae, code lost:
    
        if (r10.onNavigationEvent(r1, r4) == r5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b0, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onWarmupCompleted(@NotNull clearCommandLine<? super TTFullScreenVideoActivity3> clearcommandline, @NotNull FileSystem fileSystem, @NotNull access6900<TTFullScreenVideoActivity3> access6900Var, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, boolean z, boolean z2, @NotNull access13800<? super Unit> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        FileSystem fileSystem2;
        access6900<TTFullScreenVideoActivity3> access6900Var2;
        boolean z3;
        FileSystem fileSystem3;
        clearCommandLine<? super TTFullScreenVideoActivity3> clearcommandline2;
        boolean z4;
        List<TTFullScreenVideoActivity3> listListOrNull;
        TTFullScreenVideoActivity3 tTFullScreenVideoActivity32 = tTFullScreenVideoActivity3;
        boolean z5 = z2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i = onextracallbackwithresult.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onextracallbackwithresult.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (z5) {
                fileSystem2 = fileSystem;
                access6900Var2 = access6900Var;
                z3 = z;
            } else {
                onextracallbackwithresult.L$0 = clearcommandline;
                fileSystem2 = fileSystem;
                onextracallbackwithresult.L$1 = fileSystem2;
                access6900Var2 = access6900Var;
                onextracallbackwithresult.L$2 = access6900Var2;
                onextracallbackwithresult.L$3 = tTFullScreenVideoActivity32;
                z3 = z;
                onextracallbackwithresult.Z$0 = z3;
                onextracallbackwithresult.Z$1 = z5;
                onextracallbackwithresult.label = 1;
            }
            fileSystem3 = fileSystem2;
            boolean z6 = z3;
            clearcommandline2 = clearcommandline;
            z4 = z6;
        } else if (i2 == 1) {
            boolean z7 = onextracallbackwithresult.Z$1;
            boolean z8 = onextracallbackwithresult.Z$0;
            TTFullScreenVideoActivity3 tTFullScreenVideoActivity33 = (TTFullScreenVideoActivity3) onextracallbackwithresult.L$3;
            access6900Var2 = (access6900) onextracallbackwithresult.L$2;
            fileSystem3 = (FileSystem) onextracallbackwithresult.L$1;
            clearcommandline2 = (clearCommandLine) onextracallbackwithresult.L$0;
            ResultKt.onNavigationEvent(obj);
            z5 = z7;
            z4 = z8;
            tTFullScreenVideoActivity32 = tTFullScreenVideoActivity33;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            int i3 = onextracallbackwithresult.I$0;
            boolean z9 = onextracallbackwithresult.Z$1;
            boolean z10 = onextracallbackwithresult.Z$0;
            Iterator<TTFullScreenVideoActivity3> it = (Iterator) onextracallbackwithresult.L$6;
            TTFullScreenVideoActivity3 tTFullScreenVideoActivity34 = (TTFullScreenVideoActivity3) onextracallbackwithresult.L$5;
            List<TTFullScreenVideoActivity3> list = (List) onextracallbackwithresult.L$4;
            TTFullScreenVideoActivity3 tTFullScreenVideoActivity35 = (TTFullScreenVideoActivity3) onextracallbackwithresult.L$3;
            access6900<TTFullScreenVideoActivity3> access6900Var3 = (access6900) onextracallbackwithresult.L$2;
            FileSystem fileSystem4 = (FileSystem) onextracallbackwithresult.L$1;
            clearCommandLine<? super TTFullScreenVideoActivity3> clearcommandline3 = (clearCommandLine) onextracallbackwithresult.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
                while (it.hasNext()) {
                    TTFullScreenVideoActivity3 next = it.next();
                    onextracallbackwithresult.L$0 = clearcommandline3;
                    onextracallbackwithresult.L$1 = fileSystem4;
                    onextracallbackwithresult.L$2 = access6900Var3;
                    onextracallbackwithresult.L$3 = tTFullScreenVideoActivity35;
                    onextracallbackwithresult.L$4 = access15400.onNavigationEvent(list);
                    onextracallbackwithresult.L$5 = access15400.onNavigationEvent(tTFullScreenVideoActivity34);
                    onextracallbackwithresult.L$6 = it;
                    onextracallbackwithresult.L$7 = access15400.onNavigationEvent(next);
                    onextracallbackwithresult.Z$0 = z10;
                    onextracallbackwithresult.Z$1 = z9;
                    onextracallbackwithresult.I$0 = i3;
                    onextracallbackwithresult.label = 2;
                    if (onWarmupCompleted(clearcommandline3, fileSystem4, access6900Var3, next, z10, z9, onextracallbackwithresult) == objOnExtraCallback) {
                        break;
                    }
                }
                access6900Var3.removeLast();
                z4 = z10;
                listListOrNull = list;
                access6900Var2 = access6900Var3;
                fileSystem3 = fileSystem4;
                clearcommandline2 = clearcommandline3;
                z5 = z9;
                tTFullScreenVideoActivity32 = tTFullScreenVideoActivity35;
                if (z5) {
                    return Unit.INSTANCE;
                }
                onextracallbackwithresult.L$0 = access15400.onNavigationEvent(clearcommandline2);
                onextracallbackwithresult.L$1 = access15400.onNavigationEvent(fileSystem3);
                onextracallbackwithresult.L$2 = access15400.onNavigationEvent(access6900Var2);
                onextracallbackwithresult.L$3 = access15400.onNavigationEvent(tTFullScreenVideoActivity32);
                onextracallbackwithresult.L$4 = access15400.onNavigationEvent(listListOrNull);
                onextracallbackwithresult.L$5 = null;
                onextracallbackwithresult.L$6 = null;
                onextracallbackwithresult.L$7 = null;
                onextracallbackwithresult.Z$0 = z4;
                onextracallbackwithresult.Z$1 = z5;
                onextracallbackwithresult.label = 3;
            } catch (Throwable th) {
                th = th;
                access6900Var3.removeLast();
                throw th;
            }
        }
        listListOrNull = fileSystem3.listOrNull(tTFullScreenVideoActivity32);
        if (listListOrNull == null) {
            listListOrNull = CollectionsKt__CollectionsKt.emptyList();
        }
        if (!listListOrNull.isEmpty()) {
            int i4 = 0;
            TTFullScreenVideoActivity3 tTFullScreenVideoActivity36 = tTFullScreenVideoActivity32;
            while (true) {
                if (z4 && access6900Var2.contains(tTFullScreenVideoActivity36)) {
                    throw new IOException("symlink cycle at " + tTFullScreenVideoActivity32);
                }
                TTFullScreenVideoActivity3 tTFullScreenVideoActivity3OnExtraCallbackWithResult = onExtraCallbackWithResult(fileSystem3, tTFullScreenVideoActivity36);
                if (tTFullScreenVideoActivity3OnExtraCallbackWithResult == null) {
                    break;
                }
                i4++;
                tTFullScreenVideoActivity36 = tTFullScreenVideoActivity3OnExtraCallbackWithResult;
            }
        }
        if (z5) {
        }
    }

    public static final TTFullScreenVideoActivity3 onExtraCallbackWithResult(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        TTFullScreenVideoActivity3 tTFullScreenVideoActivity3OnExtraCallbackWithResult = fileSystem.metadata(tTFullScreenVideoActivity3).onExtraCallbackWithResult();
        if (tTFullScreenVideoActivity3OnExtraCallbackWithResult == null) {
            return null;
        }
        TTFullScreenVideoActivity3 tTFullScreenVideoActivity3IAuthTabCallbackStub = tTFullScreenVideoActivity3.IAuthTabCallbackStub();
        Intrinsics.checkNotNull(tTFullScreenVideoActivity3IAuthTabCallbackStub);
        return tTFullScreenVideoActivity3IAuthTabCallbackStub.IAuthTabCallback(tTFullScreenVideoActivity3OnExtraCallbackWithResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x003e, blocks: (B:3:0x0012, B:24:0x003d, B:16:0x002f, B:4:0x001a, B:13:0x002a), top: B:45:0x0012, inners: #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull FileSystem fileSystem, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity3, @NotNull TTFullScreenVideoActivity3 tTFullScreenVideoActivity32) throws IOException {
        Throwable th;
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity3, "");
        Intrinsics.checkNotNullParameter(tTFullScreenVideoActivity32, "");
        TTHistoryActivity42 tTHistoryActivity42Source = fileSystem.source(tTFullScreenVideoActivity3);
        Throwable th2 = null;
        try {
            TTAppOpenAdActivity9 tTAppOpenAdActivity9OnExtraCallbackWithResult = TTCeilingLandingPageActivity5.onExtraCallbackWithResult(FileSystem.sink$default(fileSystem, tTFullScreenVideoActivity32, false, 2, null));
            try {
                tTAppOpenAdActivity9OnExtraCallbackWithResult.onExtraCallbackWithResult(tTHistoryActivity42Source);
            } catch (Throwable th3) {
                if (tTAppOpenAdActivity9OnExtraCallbackWithResult != null) {
                    try {
                        tTAppOpenAdActivity9OnExtraCallbackWithResult.close();
                    } catch (Throwable th4) {
                        setExecute.onNavigationEvent(th3, th4);
                    }
                }
                th = th3;
            }
            if (tTAppOpenAdActivity9OnExtraCallbackWithResult != null) {
                try {
                    tTAppOpenAdActivity9OnExtraCallbackWithResult.close();
                    th = null;
                } catch (Throwable th5) {
                    th = th5;
                }
                if (th == null) {
                    throw th;
                }
                if (tTHistoryActivity42Source != null) {
                    try {
                        tTHistoryActivity42Source.close();
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                }
            } else {
                th = null;
                if (th == null) {
                }
            }
        } catch (Throwable th7) {
            th2 = th7;
            if (tTHistoryActivity42Source != null) {
                try {
                    tTHistoryActivity42Source.close();
                } catch (Throwable th8) {
                    setExecute.onNavigationEvent(th2, th8);
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }
}
