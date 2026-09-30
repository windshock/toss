package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.generateAesIV;
import o.logicDisuseCertRr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class cryptECDHKeyAgreement extends cryptVerifySignatureValue {
    private onWarmupCompleted IAuthTabCallback;
    private final certVerifyCertificate onExtraCallbackWithResult;
    private final String onNavigationEvent;

    static final class IAuthTabCallback extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return cryptECDHKeyAgreement.onNavigationEvent(cryptECDHKeyAgreement.this, (logicRenewCertGenmGenp<?>) null, (access13800<? super Unit>) this);
        }
    }

    static final class IAuthTabCallbackStubProxy extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return cryptECDHKeyAgreement.onTransact(cryptECDHKeyAgreement.this, null, this);
        }
    }

    static final class IAuthTabCallback_Parcel extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return cryptECDHKeyAgreement.onNavigationEvent(cryptECDHKeyAgreement.this, (certGetAuthorityKeyIdentifierInfo) null, (logicRenewCertGenmGenp<?>) null, this);
        }
    }

    static final class access100 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        access100(access13800<? super access100> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return cryptECDHKeyAgreement.IAuthTabCallbackStub(cryptECDHKeyAgreement.this, null, this);
        }
    }

    static final class asInterface extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return cryptECDHKeyAgreement.this.onNavigationEvent((cryptVerifySignatureValue) null, (logicRenewCertGenmGenp<?>) null, this);
        }
    }

    static final class extraCallback extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        extraCallback(access13800<? super extraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return cryptECDHKeyAgreement.onWarmupCompleted(cryptECDHKeyAgreement.this, this);
        }
    }

    static final class getInterfaceDescriptor extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return cryptECDHKeyAgreement.onExtraCallback(cryptECDHKeyAgreement.this, (ListIterator<? extends cryptVerifySignatureValue>) null, (logicRenewCertGenmGenp<?>) null, this);
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return cryptECDHKeyAgreement.onWarmupCompleted(cryptECDHKeyAgreement.this, (logicRenewCertGenmGenp<?>) null, (access13800<? super Unit>) this);
        }
    }

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[certVerifyCertificate.values().length];
            try {
                iArr[certVerifyCertificate.EXCLUSIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[certVerifyCertificate.PARALLEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
        }
    }

    static final class onTransact extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return cryptECDHKeyAgreement.this.IAuthTabCallback((cryptVerifySignatureValue) null, (logicRenewCertGenmGenp<?>) null, this);
        }
    }

    static final class readTypedObject<E extends certGetOCSPAddress> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        readTypedObject(access13800<? super readTypedObject> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return cryptECDHKeyAgreement.IAuthTabCallback(cryptECDHKeyAgreement.this, (logicIssueCertMakePOPOSigningInputMsg) null, this);
        }
    }

    static final class writeTypedObject extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        writeTypedObject(access13800<? super writeTypedObject> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return cryptECDHKeyAgreement.this.onExtraCallback((cryptVerifySignatureValue) null, (logicRenewCertGenmGenp<?>) null, this);
        }
    }

    @Override // o.cryptVerifySignatureValue
    public Object IAuthTabCallback(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        return IAuthTabCallback(this, logicrenewcertgenmgenp, access13800Var);
    }

    @Override // o.cryptVerifySignatureValue
    public Object IAuthTabCallbackDefault(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        return IAuthTabCallbackStub(this, logicrenewcertgenmgenp, access13800Var);
    }

    @Override // o.cryptVerifySignatureValue
    public Object asInterface(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        return onTransact(this, logicrenewcertgenmgenp, access13800Var);
    }

    @Override // o.cryptVerifySignatureValue
    public Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var) {
        return IAuthTabCallback(this, access13800Var);
    }

    protected Object onExtraCallback(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        return onExtraCallbackWithResult(this, logicrenewcertgenmgenp, access13800Var);
    }

    @Override // o.cryptVerifySignatureValue
    public Object onExtraCallbackWithResult(@NotNull ListIterator<? extends cryptVerifySignatureValue> listIterator, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        return onExtraCallback(this, listIterator, logicrenewcertgenmgenp, access13800Var);
    }

    protected Object onExtraCallbackWithResult(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        return onExtraCallback(this, logicrenewcertgenmgenp, access13800Var);
    }

    @Override // o.cryptVerifySignatureValue
    public Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) {
        return onWarmupCompleted(this, access13800Var);
    }

    @Override // o.cryptVerifySignatureValue
    public Object onNavigationEvent(@NotNull certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        return onNavigationEvent(this, certgetauthoritykeyidentifierinfo, logicrenewcertgenmgenp, access13800Var);
    }

    public Object onNavigationEvent(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        return onWarmupCompleted(this, logicrenewcertgenmgenp, access13800Var);
    }

    @Override // o.cryptVerifySignatureValue
    public Object onWarmupCompleted(@NotNull cryptVerifySignatureValue cryptverifysignaturevalue, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        return onWarmupCompleted(this, cryptverifysignaturevalue, logicrenewcertgenmgenp, access13800Var);
    }

    @Override // o.cryptVerifySignatureValue
    public <E extends certGetOCSPAddress> Object onWarmupCompleted(@NotNull logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsg, @NotNull access13800<? super Pair<? extends logicIssueCertGenmGenp<E>, ? extends logicIssueClose>> access13800Var) {
        return IAuthTabCallback(this, logicissuecertmakepoposigninginputmsg, access13800Var);
    }

    @Override // o.cryptVerifySignatureValue
    public Object onWarmupCompleted(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        return onNavigationEvent(this, logicrenewcertgenmgenp, access13800Var);
    }

    @Override // o.getKMPrikey
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public cryptECDHKeyAgreement onExtraCallbackWithResult() {
        return this;
    }

    @Override // o.generateAesIV
    public String IAuthTabCallbackStubProxy() {
        return this.onNavigationEvent;
    }

    @Override // o.generateAesIV
    public certVerifyCertificate IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public cryptECDHKeyAgreement(@Nullable String str, @NotNull certVerifyCertificate certverifycertificate) {
        Intrinsics.checkNotNullParameter(certverifycertificate, "");
        this.onNavigationEvent = str;
        this.onExtraCallbackWithResult = certverifycertificate;
        this.IAuthTabCallback = new onWarmupCompleted();
    }

    static final class onWarmupCompleted {
        private boolean IAuthTabCallback;
        private certSetTrustRootCACert IAuthTabCallbackStub;
        private boolean onExtraCallback;
        private cryptVerifySignatureValue onExtraCallbackWithResult;
        private cryptVerifySignatureValue onNavigationEvent;
        private cryptVerifySignatureValue onWarmupCompleted;
        private final Set<generateAesIV.onExtraCallbackWithResult> onTransact = new LinkedHashSet();
        private final Set<cryptVerifySignatureValue> asBinder = new LinkedHashSet();
        private final Set<logicIssueCertSendConf<?>> asInterface = new LinkedHashSet();

        public final Set<generateAesIV.onExtraCallbackWithResult> onExtraCallback() {
            return this.onTransact;
        }

        public final Set<cryptVerifySignatureValue> asBinder() {
            return this.asBinder;
        }

        public final void IAuthTabCallback(@Nullable cryptVerifySignatureValue cryptverifysignaturevalue) {
            this.onExtraCallbackWithResult = cryptverifysignaturevalue;
        }

        public final cryptVerifySignatureValue onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        public final cryptVerifySignatureValue onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        public final void onWarmupCompleted(@Nullable cryptVerifySignatureValue cryptverifysignaturevalue) {
            this.onWarmupCompleted = cryptverifysignaturevalue;
        }

        public final Set<logicIssueCertSendConf<?>> IAuthTabCallbackDefault() {
            return this.asInterface;
        }

        public final boolean onTransact() {
            return this.onExtraCallback;
        }

        public final void onWarmupCompleted(boolean z) {
            this.onExtraCallback = z;
        }

        public final boolean IAuthTabCallbackStub() {
            return this.IAuthTabCallback;
        }

        public final void onNavigationEvent(boolean z) {
            this.IAuthTabCallback = z;
        }

        public final void onNavigationEvent(@Nullable cryptVerifySignatureValue cryptverifysignaturevalue) {
            this.onNavigationEvent = cryptverifysignaturevalue;
        }

        public final cryptVerifySignatureValue onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        public final certSetTrustRootCACert IAuthTabCallback() {
            return this.IAuthTabCallbackStub;
        }
    }

    @Override // o.generateAesIV
    public Collection<generateAesIV.onExtraCallbackWithResult> asBinder() {
        return this.IAuthTabCallback.onExtraCallback();
    }

    @Override // o.generateAesIV
    public Set<generateAesIV> getInterfaceDescriptor() {
        return this.IAuthTabCallback.asBinder();
    }

    @Override // o.generateAesIV
    /* renamed from: asInterface, reason: merged with bridge method [inline-methods] */
    public cryptVerifySignatureValue onExtraCallback() {
        return this.IAuthTabCallback.onExtraCallbackWithResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.generateAesIV
    public logicDisuseCertRr IAuthTabCallbackStub() {
        return this instanceof logicDisuseCertRr ? (logicDisuseCertRr) this : getKMCert.onWarmupCompleted(this).IAuthTabCallbackStub();
    }

    @Override // o.getKMPrikey
    public Set<logicIssueCertSendConf<?>> access000() {
        return this.IAuthTabCallback.IAuthTabCallbackDefault();
    }

    @Override // o.generateAesIV
    public boolean access100() {
        return this.IAuthTabCallback.onTransact();
    }

    @Override // o.generateAesIV
    public boolean writeTypedObject() {
        return this.IAuthTabCallback.IAuthTabCallbackStub();
    }

    @Override // o.decryptRSA
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public cryptVerifySignatureValue IAuthTabCallbackDefault() {
        return this.IAuthTabCallback.onWarmupCompleted();
    }

    @Override // o.generateAesIV
    public certSetTrustRootCACert IAuthTabCallback_Parcel() {
        return this.IAuthTabCallback.IAuthTabCallback();
    }

    @Override // o.cryptVerifySignatureValue
    public void onExtraCallback(@NotNull cryptVerifySignatureValue cryptverifysignaturevalue) {
        Intrinsics.checkNotNullParameter(cryptverifysignaturevalue, "");
        if (cryptverifysignaturevalue == this.IAuthTabCallback.onWarmupCompleted()) {
            throw new IllegalStateException((cryptverifysignaturevalue + " is already a parent of " + this).toString());
        }
        if (this.IAuthTabCallback.onWarmupCompleted() != null) {
            extraCallbackWithResult();
        }
        this.IAuthTabCallback.onNavigationEvent(cryptverifysignaturevalue);
    }

    private final void extraCallbackWithResult() {
        logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (logicdisusecertrrIAuthTabCallbackStub.cD_().onWarmupCompleted()) {
            logicDisuseCertRp.onExtraCallbackWithResult(logicdisusecertrrIAuthTabCallbackStub, false, 1, null);
            return;
        }
        throw new IllegalStateException(("State " + this + " is already used in another machine instance").toString());
    }

    @Override // o.generateAesIV
    public <L extends generateAesIV.onExtraCallbackWithResult> L onExtraCallbackWithResult(@NotNull L l) {
        Intrinsics.checkNotNullParameter(l, "");
        if (this.IAuthTabCallback.onExtraCallback().add(l)) {
            return l;
        }
        throw new IllegalArgumentException((l + " is already added").toString());
    }

    @Override // o.generateAesIV
    public void IAuthTabCallback(@NotNull generateAesIV.onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.IAuthTabCallback.onExtraCallback().remove(onextracallbackwithresult);
    }

    @Override // o.generateAesIV
    public <S extends generateAesIV> S IAuthTabCallback(@NotNull S s) {
        Intrinsics.checkNotNullParameter(s, "");
        logicDisuseCertRr logicdisusecertrrOnNavigationEvent = cryptSeed.onNavigationEvent(this);
        if (logicdisusecertrrOnNavigationEvent != null && logicdisusecertrrOnNavigationEvent.onActivityLayout()) {
            throw new IllegalStateException("Can not add state after state machine started");
        }
        if (IAuthTabCallback() == certVerifyCertificate.PARALLEL) {
            if (s instanceof decryptSeed) {
                throw new IllegalArgumentException("Can not add IFinalState in parallel child mode");
            }
            if (s instanceof getFidoInfo) {
                throw new IllegalArgumentException("Can not add PseudoState in parallel child mode");
            }
        }
        String strIAuthTabCallbackStubProxy = s.IAuthTabCallbackStubProxy();
        if (strIAuthTabCallbackStubProxy != null && cryptSeed.onWarmupCompleted(this, strIAuthTabCallbackStubProxy, false) != null) {
            throw new IllegalArgumentException(("State with name " + strIAuthTabCallbackStubProxy + " already exists").toString());
        }
        cryptVerifySignatureValue cryptverifysignaturevalue = (cryptVerifySignatureValue) s;
        if (!this.IAuthTabCallback.asBinder().add(s)) {
            throw new IllegalArgumentException((s + " already added").toString());
        }
        cryptverifysignaturevalue.onExtraCallback(this);
        return s;
    }

    @Override // o.generateAesIV
    public void onExtraCallbackWithResult(@NotNull generateAesIV generateaesiv) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        if (!getInterfaceDescriptor().contains(generateaesiv)) {
            throw new IllegalArgumentException((generateaesiv + " is not part of " + this + " machine, use addState() first").toString());
        }
        if (IAuthTabCallback() != certVerifyCertificate.EXCLUSIVE) {
            throw new IllegalStateException("Can not set initial state in parallel child mode");
        }
        logicDisuseCertRr logicdisusecertrrOnNavigationEvent = cryptSeed.onNavigationEvent(this);
        if (logicdisusecertrrOnNavigationEvent != null && logicdisusecertrrOnNavigationEvent.onActivityLayout()) {
            throw new IllegalStateException("Can not change initial state after state machine started");
        }
        this.IAuthTabCallback.IAuthTabCallback((cryptVerifySignatureValue) generateaesiv);
    }

    @Override // o.getKMPrikey
    public <E extends certGetOCSPAddress> logicIssueCertSendConf<E> onExtraCallbackWithResult(@NotNull logicIssueCertSendConf<E> logicissuecertsendconf) {
        Intrinsics.checkNotNullParameter(logicissuecertsendconf, "");
        logicDisuseCertRr logicdisusecertrrOnNavigationEvent = cryptSeed.onNavigationEvent(this);
        if (logicdisusecertrrOnNavigationEvent != null && logicdisusecertrrOnNavigationEvent.onActivityLayout()) {
            throw new IllegalStateException("Can not add transition after state machine started");
        }
        this.IAuthTabCallback.IAuthTabCallbackDefault().add(logicissuecertsendconf);
        return logicissuecertsendconf;
    }

    public String toString() {
        String strValueOf;
        String simpleName = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        if (IAuthTabCallbackStubProxy() != null) {
            strValueOf = String.valueOf(IAuthTabCallbackStubProxy());
        } else {
            strValueOf = "$" + hashCode();
        }
        return simpleName + "(" + strValueOf + ")";
    }

    static /* synthetic */ Object onExtraCallback(cryptECDHKeyAgreement cryptecdhkeyagreement, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object onExtraCallbackWithResult(cryptECDHKeyAgreement cryptecdhkeyagreement, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Path cross not found for [B:32:0x00aa, B:34:0x00bd], limit reached: 83 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object onNavigationEvent(cryptECDHKeyAgreement cryptecdhkeyagreement, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub;
        cryptECDHKeyAgreement cryptecdhkeyagreement2;
        logicDisuseCertRr logicdisusecertrr;
        getVIDRandom getvidrandom;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp2;
        cryptECDHKeyAgreement cryptecdhkeyagreement3;
        Iterator it;
        logicDisuseCertRr logicdisusecertrr2;
        getVIDRandom getvidrandom2;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp3;
        Iterator it2;
        cryptECDHKeyAgreement cryptecdhkeyagreement4;
        logicDisuseCertRr logicdisusecertrr3;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i = iAuthTabCallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i - 2147483648;
            } else {
                iAuthTabCallback = cryptecdhkeyagreement.new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = iAuthTabCallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (!cryptecdhkeyagreement.access100()) {
                logicdisusecertrrIAuthTabCallbackStub = cryptecdhkeyagreement.IAuthTabCallbackStub();
                if (cryptecdhkeyagreement.ICustomTabsCallback() != null) {
                    onExtraCallbackWithResult onextracallbackwithresult = cryptecdhkeyagreement.new onExtraCallbackWithResult();
                    iAuthTabCallback.L$0 = cryptecdhkeyagreement;
                    iAuthTabCallback.L$1 = logicrenewcertgenmgenp;
                    iAuthTabCallback.L$2 = logicdisusecertrrIAuthTabCallbackStub;
                    iAuthTabCallback.label = 1;
                    if (cryptSeed.onExtraCallback(logicdisusecertrrIAuthTabCallbackStub, onextracallbackwithresult, iAuthTabCallback) != objOnExtraCallback) {
                    }
                    return objOnExtraCallback;
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    logicdisusecertrr = (logicDisuseCertRr) iAuthTabCallback.L$2;
                    logicrenewcertgenmgenp = (logicRenewCertGenmGenp) iAuthTabCallback.L$1;
                    cryptecdhkeyagreement2 = (cryptECDHKeyAgreement) iAuthTabCallback.L$0;
                    ResultKt.onNavigationEvent(obj);
                    logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub2 = cryptecdhkeyagreement2.IAuthTabCallbackStub();
                    Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub2, "");
                    getvidrandom = (getVIDRandom) logicdisusecertrrIAuthTabCallbackStub2;
                    if (!getvidrandom.extraCallbackWithResult()) {
                        logicrenewcertgenmgenp2 = logicrenewcertgenmgenp;
                        cryptecdhkeyagreement3 = cryptecdhkeyagreement2;
                        it = CollectionsKt___CollectionsKt.toList(cryptecdhkeyagreement2.asBinder()).iterator();
                        logicdisusecertrr2 = logicdisusecertrr;
                        getvidrandom2 = getvidrandom;
                        while (it.hasNext()) {
                        }
                        logicdisusecertrr = logicdisusecertrr2;
                        logicrenewcertgenmgenp = logicrenewcertgenmgenp2;
                        cryptecdhkeyagreement2 = cryptecdhkeyagreement3;
                    }
                    Intrinsics.checkNotNull(logicdisusecertrr, "");
                    if (!((getVIDRandom) logicdisusecertrr).extraCallbackWithResult()) {
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getVIDRandom getvidrandom3 = (getVIDRandom) iAuthTabCallback.L$4;
                    it2 = (Iterator) iAuthTabCallback.L$3;
                    logicdisusecertrr3 = (logicDisuseCertRr) iAuthTabCallback.L$2;
                    logicrenewcertgenmgenp3 = (logicRenewCertGenmGenp) iAuthTabCallback.L$1;
                    cryptecdhkeyagreement4 = (cryptECDHKeyAgreement) iAuthTabCallback.L$0;
                    try {
                        ResultKt.onNavigationEvent(obj);
                    } catch (Exception e) {
                        getvidrandom3.onExtraCallback(e);
                    }
                    while (it2.hasNext()) {
                        logicDisuseCertRr.IAuthTabCallback iAuthTabCallback2 = (logicDisuseCertRr.IAuthTabCallback) it2.next();
                        getVIDRandom getvidrandom4 = (getVIDRandom) logicdisusecertrr3;
                        try {
                            iAuthTabCallback.L$0 = cryptecdhkeyagreement4;
                            iAuthTabCallback.L$1 = logicrenewcertgenmgenp3;
                            iAuthTabCallback.L$2 = logicdisusecertrr3;
                            iAuthTabCallback.L$3 = it2;
                            iAuthTabCallback.L$4 = getvidrandom4;
                            iAuthTabCallback.L$5 = null;
                            iAuthTabCallback.label = 4;
                        } catch (Exception e2) {
                            getvidrandom4.onExtraCallback(e2);
                        }
                        if (iAuthTabCallback2.onWarmupCompleted(cryptecdhkeyagreement4, logicrenewcertgenmgenp3, iAuthTabCallback) == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
                    }
                    return Unit.INSTANCE;
                }
                getVIDRandom getvidrandom5 = (getVIDRandom) iAuthTabCallback.L$5;
                it = (Iterator) iAuthTabCallback.L$4;
                getVIDRandom getvidrandom6 = (getVIDRandom) iAuthTabCallback.L$3;
                logicdisusecertrr2 = (logicDisuseCertRr) iAuthTabCallback.L$2;
                logicrenewcertgenmgenp2 = (logicRenewCertGenmGenp) iAuthTabCallback.L$1;
                cryptecdhkeyagreement3 = (cryptECDHKeyAgreement) iAuthTabCallback.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                } catch (Exception e3) {
                    getvidrandom5.onExtraCallback(e3);
                }
                getvidrandom2 = getvidrandom6;
                while (it.hasNext()) {
                    generateAesIV.onExtraCallbackWithResult onextracallbackwithresult2 = (generateAesIV.onExtraCallbackWithResult) it.next();
                    try {
                    } catch (Exception e4) {
                        getvidrandom6 = getvidrandom2;
                        getvidrandom2.onExtraCallback(e4);
                    }
                    iAuthTabCallback.L$0 = cryptecdhkeyagreement3;
                    iAuthTabCallback.L$1 = logicrenewcertgenmgenp2;
                    iAuthTabCallback.L$2 = logicdisusecertrr2;
                    iAuthTabCallback.L$3 = getvidrandom2;
                    iAuthTabCallback.L$4 = it;
                    iAuthTabCallback.L$5 = getvidrandom2;
                    iAuthTabCallback.label = 3;
                    if (onextracallbackwithresult2.onExtraCallbackWithResult(logicrenewcertgenmgenp2, iAuthTabCallback) == objOnExtraCallback) {
                        break;
                    }
                }
                logicdisusecertrr = logicdisusecertrr2;
                logicrenewcertgenmgenp = logicrenewcertgenmgenp2;
                cryptecdhkeyagreement2 = cryptecdhkeyagreement3;
                Intrinsics.checkNotNull(logicdisusecertrr, "");
                if (!((getVIDRandom) logicdisusecertrr).extraCallbackWithResult()) {
                    logicrenewcertgenmgenp3 = logicrenewcertgenmgenp;
                    it2 = CollectionsKt___CollectionsKt.toList(logicdisusecertrr.cG_()).iterator();
                    cryptecdhkeyagreement4 = cryptecdhkeyagreement2;
                    logicdisusecertrr3 = logicdisusecertrr;
                    while (it2.hasNext()) {
                    }
                }
                return Unit.INSTANCE;
            }
            logicDisuseCertRr logicdisusecertrr4 = (logicDisuseCertRr) iAuthTabCallback.L$2;
            logicrenewcertgenmgenp = (logicRenewCertGenmGenp) iAuthTabCallback.L$1;
            cryptECDHKeyAgreement cryptecdhkeyagreement5 = (cryptECDHKeyAgreement) iAuthTabCallback.L$0;
            ResultKt.onNavigationEvent(obj);
            logicdisusecertrrIAuthTabCallbackStub = logicdisusecertrr4;
            cryptecdhkeyagreement = cryptecdhkeyagreement5;
        }
        cryptecdhkeyagreement.IAuthTabCallback.onWarmupCompleted(true);
        iAuthTabCallback.L$0 = cryptecdhkeyagreement;
        iAuthTabCallback.L$1 = logicrenewcertgenmgenp;
        iAuthTabCallback.L$2 = logicdisusecertrrIAuthTabCallbackStub;
        iAuthTabCallback.label = 2;
        if (cryptecdhkeyagreement.onExtraCallbackWithResult(logicrenewcertgenmgenp, iAuthTabCallback) != objOnExtraCallback) {
            cryptecdhkeyagreement2 = cryptecdhkeyagreement;
            logicdisusecertrr = logicdisusecertrrIAuthTabCallbackStub;
            logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub22 = cryptecdhkeyagreement2.IAuthTabCallbackStub();
            Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub22, "");
            getvidrandom = (getVIDRandom) logicdisusecertrrIAuthTabCallbackStub22;
            if (!getvidrandom.extraCallbackWithResult()) {
            }
            Intrinsics.checkNotNull(logicdisusecertrr, "");
            if (!((getVIDRandom) logicdisusecertrr).extraCallbackWithResult()) {
            }
            return Unit.INSTANCE;
        }
        return objOnExtraCallback;
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function0<String> {
        onExtraCallbackWithResult() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Parent " + cryptECDHKeyAgreement.this.ICustomTabsCallback() + " entering child " + cryptECDHKeyAgreement.this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object onWarmupCompleted(cryptECDHKeyAgreement cryptecdhkeyagreement, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        onExtraCallback onextracallback;
        cryptECDHKeyAgreement cryptecdhkeyagreement2;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp2;
        getVIDRandom getvidrandom;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp3;
        cryptECDHKeyAgreement cryptecdhkeyagreement3;
        getVIDRandom getvidrandom2;
        Iterator it;
        logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp4;
        cryptECDHKeyAgreement cryptecdhkeyagreement4;
        Iterator it2;
        logicDisuseCertRr logicdisusecertrr;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i = onextracallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i - 2147483648;
            } else {
                onextracallback = cryptecdhkeyagreement.new onExtraCallback(access13800Var);
            }
        }
        Object obj = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onextracallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (cryptecdhkeyagreement.access100()) {
                asBinder asbinder = cryptecdhkeyagreement.new asBinder();
                onextracallback.L$0 = cryptecdhkeyagreement;
                onextracallback.L$1 = logicrenewcertgenmgenp;
                onextracallback.label = 1;
                if (cryptSeed.onExtraCallback(cryptecdhkeyagreement, asbinder, onextracallback) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                logicrenewcertgenmgenp2 = (logicRenewCertGenmGenp) onextracallback.L$1;
                cryptecdhkeyagreement2 = (cryptECDHKeyAgreement) onextracallback.L$0;
                ResultKt.onNavigationEvent(obj);
                cryptecdhkeyagreement2.IAuthTabCallback.onWarmupCompleted((cryptVerifySignatureValue) null);
                cryptecdhkeyagreement2.IAuthTabCallback.onNavigationEvent(false);
                cryptecdhkeyagreement2.IAuthTabCallback.onWarmupCompleted(false);
                logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub2 = cryptecdhkeyagreement2.IAuthTabCallbackStub();
                Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub2, "");
                getvidrandom = (getVIDRandom) logicdisusecertrrIAuthTabCallbackStub2;
                if (!getvidrandom.extraCallbackWithResult()) {
                    logicrenewcertgenmgenp3 = logicrenewcertgenmgenp2;
                    cryptecdhkeyagreement3 = cryptecdhkeyagreement2;
                    getvidrandom2 = getvidrandom;
                    it = CollectionsKt___CollectionsKt.toList(cryptecdhkeyagreement2.asBinder()).iterator();
                    while (it.hasNext()) {
                    }
                    logicrenewcertgenmgenp2 = logicrenewcertgenmgenp3;
                    cryptecdhkeyagreement2 = cryptecdhkeyagreement3;
                }
                logicdisusecertrrIAuthTabCallbackStub = cryptecdhkeyagreement2.IAuthTabCallbackStub();
                Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub, "");
                if (!((getVIDRandom) logicdisusecertrrIAuthTabCallbackStub).extraCallbackWithResult()) {
                }
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getVIDRandom getvidrandom3 = (getVIDRandom) onextracallback.L$4;
                it2 = (Iterator) onextracallback.L$3;
                logicdisusecertrr = (logicDisuseCertRr) onextracallback.L$2;
                logicrenewcertgenmgenp4 = (logicRenewCertGenmGenp) onextracallback.L$1;
                cryptecdhkeyagreement4 = (cryptECDHKeyAgreement) onextracallback.L$0;
                try {
                    ResultKt.onNavigationEvent(obj);
                } catch (Exception e) {
                    getvidrandom3.onExtraCallback(e);
                }
                while (it2.hasNext()) {
                    logicDisuseCertRr.IAuthTabCallback iAuthTabCallback = (logicDisuseCertRr.IAuthTabCallback) it2.next();
                    getVIDRandom getvidrandom4 = (getVIDRandom) logicdisusecertrr;
                    try {
                        onextracallback.L$0 = cryptecdhkeyagreement4;
                        onextracallback.L$1 = logicrenewcertgenmgenp4;
                        onextracallback.L$2 = logicdisusecertrr;
                        onextracallback.L$3 = it2;
                        onextracallback.L$4 = getvidrandom4;
                        onextracallback.label = 4;
                    } catch (Exception e2) {
                        getvidrandom4.onExtraCallback(e2);
                    }
                    if (iAuthTabCallback.onExtraCallbackWithResult(cryptecdhkeyagreement4, logicrenewcertgenmgenp4, onextracallback) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                }
                return Unit.INSTANCE;
            }
            getVIDRandom getvidrandom5 = (getVIDRandom) onextracallback.L$4;
            it = (Iterator) onextracallback.L$3;
            getVIDRandom getvidrandom6 = (getVIDRandom) onextracallback.L$2;
            logicrenewcertgenmgenp3 = (logicRenewCertGenmGenp) onextracallback.L$1;
            cryptecdhkeyagreement3 = (cryptECDHKeyAgreement) onextracallback.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (Exception e3) {
                getvidrandom5.onExtraCallback(e3);
            }
            getvidrandom2 = getvidrandom6;
            while (it.hasNext()) {
                generateAesIV.onExtraCallbackWithResult onextracallbackwithresult = (generateAesIV.onExtraCallbackWithResult) it.next();
                try {
                } catch (Exception e4) {
                    getvidrandom6 = getvidrandom2;
                    getvidrandom2.onExtraCallback(e4);
                }
                onextracallback.L$0 = cryptecdhkeyagreement3;
                onextracallback.L$1 = logicrenewcertgenmgenp3;
                onextracallback.L$2 = getvidrandom2;
                onextracallback.L$3 = it;
                onextracallback.L$4 = getvidrandom2;
                onextracallback.label = 3;
                if (onextracallbackwithresult.onWarmupCompleted(logicrenewcertgenmgenp3, onextracallback) == objOnExtraCallback) {
                    break;
                }
            }
            logicrenewcertgenmgenp2 = logicrenewcertgenmgenp3;
            cryptecdhkeyagreement2 = cryptecdhkeyagreement3;
            logicdisusecertrrIAuthTabCallbackStub = cryptecdhkeyagreement2.IAuthTabCallbackStub();
            Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub, "");
            if (!((getVIDRandom) logicdisusecertrrIAuthTabCallbackStub).extraCallbackWithResult()) {
                logicrenewcertgenmgenp4 = logicrenewcertgenmgenp2;
                cryptecdhkeyagreement4 = cryptecdhkeyagreement2;
                it2 = CollectionsKt___CollectionsKt.toList(logicdisusecertrrIAuthTabCallbackStub.cG_()).iterator();
                logicdisusecertrr = logicdisusecertrrIAuthTabCallbackStub;
                while (it2.hasNext()) {
                }
            }
            return Unit.INSTANCE;
        }
        logicrenewcertgenmgenp = (logicRenewCertGenmGenp) onextracallback.L$1;
        cryptecdhkeyagreement = (cryptECDHKeyAgreement) onextracallback.L$0;
        ResultKt.onNavigationEvent(obj);
        onextracallback.L$0 = cryptecdhkeyagreement;
        onextracallback.L$1 = logicrenewcertgenmgenp;
        onextracallback.label = 2;
        if (cryptecdhkeyagreement.onExtraCallback(logicrenewcertgenmgenp, onextracallback) != objOnExtraCallback) {
            logicRenewCertGenmGenp<?> logicrenewcertgenmgenp5 = logicrenewcertgenmgenp;
            cryptecdhkeyagreement2 = cryptecdhkeyagreement;
            logicrenewcertgenmgenp2 = logicrenewcertgenmgenp5;
            cryptecdhkeyagreement2.IAuthTabCallback.onWarmupCompleted((cryptVerifySignatureValue) null);
            cryptecdhkeyagreement2.IAuthTabCallback.onNavigationEvent(false);
            cryptecdhkeyagreement2.IAuthTabCallback.onWarmupCompleted(false);
            logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub22 = cryptecdhkeyagreement2.IAuthTabCallbackStub();
            Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub22, "");
            getvidrandom = (getVIDRandom) logicdisusecertrrIAuthTabCallbackStub22;
            if (!getvidrandom.extraCallbackWithResult()) {
            }
            logicdisusecertrrIAuthTabCallbackStub = cryptecdhkeyagreement2.IAuthTabCallbackStub();
            Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub, "");
            if (!((getVIDRandom) logicdisusecertrrIAuthTabCallbackStub).extraCallbackWithResult()) {
            }
            return Unit.INSTANCE;
        }
        return objOnExtraCallback;
    }

    static final class asBinder extends Lambda implements Function0<String> {
        asBinder() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exiting " + cryptECDHKeyAgreement.this;
        }
    }

    static /* synthetic */ Object onWarmupCompleted(cryptECDHKeyAgreement cryptecdhkeyagreement, cryptVerifySignatureValue cryptverifysignaturevalue, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        if (cryptecdhkeyagreement.IAuthTabCallback() == certVerifyCertificate.PARALLEL) {
            Set<generateAesIV> interfaceDescriptor = cryptecdhkeyagreement.getInterfaceDescriptor();
            if (!(interfaceDescriptor instanceof Collection) || !interfaceDescriptor.isEmpty()) {
                Iterator<T> it = interfaceDescriptor.iterator();
                while (it.hasNext()) {
                    if (!((generateAesIV) it.next()).writeTypedObject()) {
                    }
                }
            }
            cryptecdhkeyagreement.IAuthTabCallback.onNavigationEvent(true);
            Object objOnNavigationEvent = cryptecdhkeyagreement.onNavigationEvent(cryptverifysignaturevalue, logicrenewcertgenmgenp, access13800Var);
            return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a6 -> B:28:0x00ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <E extends certGetOCSPAddress> Object IAuthTabCallback(cryptECDHKeyAgreement cryptecdhkeyagreement, logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsg, access13800<? super Pair<? extends logicIssueCertGenmGenp<E>, ? extends logicIssueClose>> access13800Var) {
        readTypedObject readtypedobject;
        ArrayList arrayList;
        cryptECDHKeyAgreement cryptecdhkeyagreement2;
        Iterator it;
        readTypedObject readtypedobject2;
        logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsg2;
        ArrayList arrayListListOfNotNull;
        logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsg3;
        if (access13800Var instanceof readTypedObject) {
            readtypedobject = (readTypedObject) access13800Var;
            int i = readtypedobject.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                readtypedobject.label = i - 2147483648;
            } else {
                readtypedobject = cryptecdhkeyagreement.new readTypedObject(access13800Var);
            }
        }
        Object objOnExtraCallback = readtypedobject.result;
        Object objOnExtraCallback2 = access14100.onExtraCallback();
        int i2 = readtypedobject.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            List<cryptVerifySignatureValue> listOnNavigationEvent = cryptecdhkeyagreement.onNavigationEvent();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listOnNavigationEvent) {
                if (!(((cryptVerifySignatureValue) obj) instanceof logicDisuseCertRr)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList();
            cryptecdhkeyagreement2 = cryptecdhkeyagreement;
            it = arrayList2.iterator();
            readtypedobject2 = readtypedobject;
            logicissuecertmakepoposigninginputmsg2 = logicissuecertmakepoposigninginputmsg;
            if (it.hasNext()) {
            }
            return objOnExtraCallback2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            logicissuecertmakepoposigninginputmsg3 = (logicIssueCertMakePOPOSigningInputMsg) readtypedobject.L$1;
            cryptecdhkeyagreement2 = (cryptECDHKeyAgreement) readtypedobject.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallback);
            arrayListListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(objOnExtraCallback);
            logicissuecertmakepoposigninginputmsg2 = logicissuecertmakepoposigninginputmsg3;
            List list = arrayListListOfNotNull;
            if (cryptecdhkeyagreement2.IAuthTabCallbackStub().cD_().onNavigationEvent()) {
                if (list.size() > 1) {
                    throw new IllegalStateException(("Multiple transitions match " + logicissuecertmakepoposigninginputmsg2.onWarmupCompleted() + ", " + list + " in " + cryptecdhkeyagreement2).toString());
                }
                return (Pair) CollectionsKt___CollectionsKt.singleOrNull(list);
            }
            return (Pair) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        it = (Iterator) readtypedobject.L$3;
        ?? r9 = (Collection) readtypedobject.L$2;
        logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsg4 = (logicIssueCertMakePOPOSigningInputMsg) readtypedobject.L$1;
        cryptECDHKeyAgreement cryptecdhkeyagreement3 = (cryptECDHKeyAgreement) readtypedobject.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallback);
        readTypedObject readtypedobject3 = readtypedobject;
        ArrayList arrayList3 = r9;
        cryptecdhkeyagreement2 = cryptecdhkeyagreement3;
        readTypedObject readtypedobject4 = readtypedobject3;
        Pair pair = (Pair) objOnExtraCallback;
        if (pair != null) {
            arrayList3.add(pair);
        }
        arrayList = arrayList3;
        logicissuecertmakepoposigninginputmsg2 = logicissuecertmakepoposigninginputmsg4;
        readtypedobject2 = readtypedobject4;
        if (it.hasNext()) {
            cryptVerifySignatureValue cryptverifysignaturevalue = (cryptVerifySignatureValue) it.next();
            readtypedobject2.L$0 = cryptecdhkeyagreement2;
            readtypedobject2.L$1 = logicissuecertmakepoposigninginputmsg2;
            readtypedobject2.L$2 = arrayList;
            readtypedobject2.L$3 = it;
            readtypedobject2.label = 1;
            Object objOnWarmupCompleted = cryptverifysignaturevalue.onWarmupCompleted(logicissuecertmakepoposigninginputmsg2, readtypedobject2);
            if (objOnWarmupCompleted != objOnExtraCallback2) {
                logicIssueCertMakePOPOSigningInputMsg<E> logicissuecertmakepoposigninginputmsg5 = logicissuecertmakepoposigninginputmsg2;
                arrayList3 = arrayList;
                objOnExtraCallback = objOnWarmupCompleted;
                readtypedobject4 = readtypedobject2;
                logicissuecertmakepoposigninginputmsg4 = logicissuecertmakepoposigninginputmsg5;
                Pair pair2 = (Pair) objOnExtraCallback;
                if (pair2 != null) {
                }
                arrayList = arrayList3;
                logicissuecertmakepoposigninginputmsg2 = logicissuecertmakepoposigninginputmsg4;
                readtypedobject2 = readtypedobject4;
                if (it.hasNext()) {
                    arrayListListOfNotNull = arrayList;
                    if (arrayListListOfNotNull.isEmpty()) {
                        readtypedobject2.L$0 = cryptecdhkeyagreement2;
                        readtypedobject2.L$1 = logicissuecertmakepoposigninginputmsg2;
                        readtypedobject2.L$2 = null;
                        readtypedobject2.L$3 = null;
                        readtypedobject2.label = 2;
                        objOnExtraCallback = getKMCert.onExtraCallback(cryptecdhkeyagreement2, logicissuecertmakepoposigninginputmsg2, readtypedobject2);
                        if (objOnExtraCallback != objOnExtraCallback2) {
                            logicissuecertmakepoposigninginputmsg3 = logicissuecertmakepoposigninginputmsg2;
                            arrayListListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(objOnExtraCallback);
                            logicissuecertmakepoposigninginputmsg2 = logicissuecertmakepoposigninginputmsg3;
                        }
                    }
                    List list2 = arrayListListOfNotNull;
                    if (cryptecdhkeyagreement2.IAuthTabCallbackStub().cD_().onNavigationEvent()) {
                    }
                }
            }
        }
        return objOnExtraCallback2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f9, code lost:
    
        if (r8.asInterface(r9, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009d, code lost:
    
        r8 = r6;
     */
    /* JADX WARN: Path cross not found for [B:10:0x0027, B:20:0x0071], limit reached: 51 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object onTransact(cryptECDHKeyAgreement cryptecdhkeyagreement, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy;
        cryptVerifySignatureValue cryptverifysignaturevalue;
        Iterator it;
        cryptVerifySignatureValue cryptverifysignaturevalue2;
        cryptECDHKeyAgreement cryptecdhkeyagreement2;
        if (access13800Var instanceof IAuthTabCallbackStubProxy) {
            iAuthTabCallbackStubProxy = (IAuthTabCallbackStubProxy) access13800Var;
            int i = iAuthTabCallbackStubProxy.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackStubProxy.label = i - 2147483648;
            } else {
                iAuthTabCallbackStubProxy = cryptecdhkeyagreement.new IAuthTabCallbackStubProxy(access13800Var);
            }
        }
        Object obj = iAuthTabCallbackStubProxy.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = iAuthTabCallbackStubProxy.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (cryptecdhkeyagreement.getInterfaceDescriptor().isEmpty()) {
                return Unit.INSTANCE;
            }
            int i3 = onNavigationEvent.IAuthTabCallback[cryptecdhkeyagreement.IAuthTabCallback().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    it = cryptecdhkeyagreement.IAuthTabCallback.asBinder().iterator();
                    if (it.hasNext()) {
                    }
                }
                return Unit.INSTANCE;
            }
            generateAesIV generateaesivOnExtraCallback = cryptSeed.onExtraCallback(cryptecdhkeyagreement);
            Intrinsics.checkNotNull(generateaesivOnExtraCallback, "");
            cryptVerifySignatureValue cryptverifysignaturevalue3 = (cryptVerifySignatureValue) generateaesivOnExtraCallback;
            iAuthTabCallbackStubProxy.L$0 = logicrenewcertgenmgenp;
            iAuthTabCallbackStubProxy.L$1 = cryptverifysignaturevalue3;
            iAuthTabCallbackStubProxy.label = 1;
            if (cryptecdhkeyagreement.onExtraCallback(cryptverifysignaturevalue3, logicrenewcertgenmgenp, iAuthTabCallbackStubProxy) != objOnExtraCallback) {
                cryptverifysignaturevalue = cryptverifysignaturevalue3;
                if (!(cryptverifysignaturevalue instanceof logicDisuseCertRr)) {
                }
                return Unit.INSTANCE;
            }
            return objOnExtraCallback;
        }
        if (i2 == 1) {
            cryptverifysignaturevalue = (cryptVerifySignatureValue) iAuthTabCallbackStubProxy.L$1;
            logicrenewcertgenmgenp = (logicRenewCertGenmGenp) iAuthTabCallbackStubProxy.L$0;
            ResultKt.onNavigationEvent(obj);
            if (!(cryptverifysignaturevalue instanceof logicDisuseCertRr)) {
                iAuthTabCallbackStubProxy.L$0 = null;
                iAuthTabCallbackStubProxy.L$1 = null;
                iAuthTabCallbackStubProxy.label = 2;
            }
            return Unit.INSTANCE;
        }
        if (i2 == 2) {
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
        if (i2 == 3) {
            cryptverifysignaturevalue2 = (cryptVerifySignatureValue) iAuthTabCallbackStubProxy.L$3;
            Iterator it2 = (Iterator) iAuthTabCallbackStubProxy.L$2;
            logicRenewCertGenmGenp<?> logicrenewcertgenmgenp2 = (logicRenewCertGenmGenp) iAuthTabCallbackStubProxy.L$1;
            cryptecdhkeyagreement2 = (cryptECDHKeyAgreement) iAuthTabCallbackStubProxy.L$0;
            ResultKt.onNavigationEvent(obj);
            it = it2;
            logicrenewcertgenmgenp = logicrenewcertgenmgenp2;
            if (cryptverifysignaturevalue2 instanceof logicDisuseCertRr) {
            }
            if (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 4) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it3 = (Iterator) iAuthTabCallbackStubProxy.L$2;
        logicrenewcertgenmgenp = (logicRenewCertGenmGenp) iAuthTabCallbackStubProxy.L$1;
        cryptECDHKeyAgreement cryptecdhkeyagreement3 = (cryptECDHKeyAgreement) iAuthTabCallbackStubProxy.L$0;
        ResultKt.onNavigationEvent(obj);
        it = it3;
        cryptecdhkeyagreement = cryptecdhkeyagreement3;
        if (it.hasNext()) {
            cryptVerifySignatureValue cryptverifysignaturevalue4 = (cryptVerifySignatureValue) it.next();
            iAuthTabCallbackStubProxy.L$0 = cryptecdhkeyagreement;
            iAuthTabCallbackStubProxy.L$1 = logicrenewcertgenmgenp;
            iAuthTabCallbackStubProxy.L$2 = it;
            iAuthTabCallbackStubProxy.L$3 = cryptverifysignaturevalue4;
            iAuthTabCallbackStubProxy.label = 3;
            if (cryptecdhkeyagreement.IAuthTabCallback(cryptverifysignaturevalue4, logicrenewcertgenmgenp, iAuthTabCallbackStubProxy) != objOnExtraCallback) {
                cryptecdhkeyagreement2 = cryptecdhkeyagreement;
                cryptverifysignaturevalue2 = cryptverifysignaturevalue4;
                if (cryptverifysignaturevalue2 instanceof logicDisuseCertRr) {
                    iAuthTabCallbackStubProxy.L$0 = cryptecdhkeyagreement2;
                    iAuthTabCallbackStubProxy.L$1 = logicrenewcertgenmgenp;
                    iAuthTabCallbackStubProxy.L$2 = it;
                    iAuthTabCallbackStubProxy.L$3 = null;
                    iAuthTabCallbackStubProxy.label = 4;
                    if (cryptverifysignaturevalue2.asInterface(logicrenewcertgenmgenp, iAuthTabCallbackStubProxy) != objOnExtraCallback) {
                        cryptecdhkeyagreement = cryptecdhkeyagreement2;
                    }
                }
                if (it.hasNext()) {
                }
            }
            return objOnExtraCallback;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (r6.asInterface(r8, r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
    
        if (r6.onExtraCallbackWithResult(r7, r8, r0) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0110, code lost:
    
        if (r5.asInterface(r8, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0136, code lost:
    
        if (r6.onExtraCallbackWithResult(r7, r8, r0) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0113 -> B:27:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object onExtraCallback(cryptECDHKeyAgreement cryptecdhkeyagreement, ListIterator<? extends cryptVerifySignatureValue> listIterator, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        getInterfaceDescriptor getinterfacedescriptor;
        cryptVerifySignatureValue cryptverifysignaturevaluePrevious;
        cryptVerifySignatureValue cryptverifysignaturevalue;
        Iterator it;
        cryptVerifySignatureValue cryptverifysignaturevalue2;
        cryptECDHKeyAgreement cryptecdhkeyagreement2;
        if (access13800Var instanceof getInterfaceDescriptor) {
            getinterfacedescriptor = (getInterfaceDescriptor) access13800Var;
            int i = getinterfacedescriptor.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getinterfacedescriptor.label = i - 2147483648;
            } else {
                getinterfacedescriptor = cryptecdhkeyagreement.new getInterfaceDescriptor(access13800Var);
            }
        }
        Object obj = getinterfacedescriptor.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        switch (getinterfacedescriptor.label) {
            case 0:
                ResultKt.onNavigationEvent(obj);
                if (!listIterator.hasPrevious()) {
                    getinterfacedescriptor.label = 1;
                    break;
                } else {
                    cryptverifysignaturevaluePrevious = listIterator.previous();
                    int i2 = onNavigationEvent.IAuthTabCallback[cryptecdhkeyagreement.IAuthTabCallback().ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            it = cryptecdhkeyagreement.IAuthTabCallback.asBinder().iterator();
                            if (it.hasNext()) {
                                cryptVerifySignatureValue cryptverifysignaturevalue3 = (cryptVerifySignatureValue) it.next();
                                getinterfacedescriptor.L$0 = cryptecdhkeyagreement;
                                getinterfacedescriptor.L$1 = listIterator;
                                getinterfacedescriptor.L$2 = logicrenewcertgenmgenp;
                                getinterfacedescriptor.L$3 = cryptverifysignaturevaluePrevious;
                                getinterfacedescriptor.L$4 = it;
                                getinterfacedescriptor.L$5 = cryptverifysignaturevalue3;
                                getinterfacedescriptor.label = 4;
                                if (cryptecdhkeyagreement.IAuthTabCallback(cryptverifysignaturevalue3, logicrenewcertgenmgenp, getinterfacedescriptor) != objOnExtraCallback) {
                                    cryptecdhkeyagreement2 = cryptecdhkeyagreement;
                                    cryptverifysignaturevalue2 = cryptverifysignaturevalue3;
                                    if (!(cryptverifysignaturevalue2 instanceof logicDisuseCertRr)) {
                                        if (cryptverifysignaturevalue2 == cryptverifysignaturevaluePrevious) {
                                            getinterfacedescriptor.L$0 = cryptecdhkeyagreement2;
                                            getinterfacedescriptor.L$1 = listIterator;
                                            getinterfacedescriptor.L$2 = logicrenewcertgenmgenp;
                                            getinterfacedescriptor.L$3 = cryptverifysignaturevaluePrevious;
                                            getinterfacedescriptor.L$4 = it;
                                            getinterfacedescriptor.L$5 = null;
                                            getinterfacedescriptor.label = 5;
                                            break;
                                        } else {
                                            getinterfacedescriptor.L$0 = cryptecdhkeyagreement2;
                                            getinterfacedescriptor.L$1 = listIterator;
                                            getinterfacedescriptor.L$2 = logicrenewcertgenmgenp;
                                            getinterfacedescriptor.L$3 = cryptverifysignaturevaluePrevious;
                                            getinterfacedescriptor.L$4 = it;
                                            getinterfacedescriptor.L$5 = null;
                                            getinterfacedescriptor.label = 6;
                                            break;
                                        }
                                        if (it.hasNext()) {
                                        }
                                    }
                                    cryptecdhkeyagreement = cryptecdhkeyagreement2;
                                    if (it.hasNext()) {
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    getinterfacedescriptor.L$0 = listIterator;
                    getinterfacedescriptor.L$1 = logicrenewcertgenmgenp;
                    getinterfacedescriptor.L$2 = cryptverifysignaturevaluePrevious;
                    getinterfacedescriptor.label = 2;
                    if (cryptecdhkeyagreement.onExtraCallback(cryptverifysignaturevaluePrevious, logicrenewcertgenmgenp, getinterfacedescriptor) != objOnExtraCallback) {
                        cryptverifysignaturevalue = cryptverifysignaturevaluePrevious;
                        if (!(cryptverifysignaturevalue instanceof logicDisuseCertRr)) {
                            getinterfacedescriptor.L$0 = null;
                            getinterfacedescriptor.L$1 = null;
                            getinterfacedescriptor.L$2 = null;
                            getinterfacedescriptor.label = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                }
                return objOnExtraCallback;
            case 1:
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            case 2:
                cryptverifysignaturevalue = (cryptVerifySignatureValue) getinterfacedescriptor.L$2;
                logicrenewcertgenmgenp = (logicRenewCertGenmGenp) getinterfacedescriptor.L$1;
                listIterator = (ListIterator) getinterfacedescriptor.L$0;
                ResultKt.onNavigationEvent(obj);
                if (!(cryptverifysignaturevalue instanceof logicDisuseCertRr)) {
                }
                return Unit.INSTANCE;
            case 3:
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            case 4:
                cryptverifysignaturevalue2 = (cryptVerifySignatureValue) getinterfacedescriptor.L$5;
                Iterator it2 = (Iterator) getinterfacedescriptor.L$4;
                cryptVerifySignatureValue cryptverifysignaturevalue4 = (cryptVerifySignatureValue) getinterfacedescriptor.L$3;
                logicRenewCertGenmGenp<?> logicrenewcertgenmgenp2 = (logicRenewCertGenmGenp) getinterfacedescriptor.L$2;
                ListIterator<? extends cryptVerifySignatureValue> listIterator2 = (ListIterator) getinterfacedescriptor.L$1;
                cryptecdhkeyagreement2 = (cryptECDHKeyAgreement) getinterfacedescriptor.L$0;
                ResultKt.onNavigationEvent(obj);
                cryptverifysignaturevaluePrevious = cryptverifysignaturevalue4;
                logicrenewcertgenmgenp = logicrenewcertgenmgenp2;
                it = it2;
                listIterator = listIterator2;
                if (!(cryptverifysignaturevalue2 instanceof logicDisuseCertRr)) {
                }
                cryptecdhkeyagreement = cryptecdhkeyagreement2;
                if (it.hasNext()) {
                }
                return Unit.INSTANCE;
            case 5:
            case 6:
                Iterator it3 = (Iterator) getinterfacedescriptor.L$4;
                cryptVerifySignatureValue cryptverifysignaturevalue5 = (cryptVerifySignatureValue) getinterfacedescriptor.L$3;
                logicrenewcertgenmgenp = (logicRenewCertGenmGenp) getinterfacedescriptor.L$2;
                ListIterator<? extends cryptVerifySignatureValue> listIterator3 = (ListIterator) getinterfacedescriptor.L$1;
                cryptECDHKeyAgreement cryptecdhkeyagreement3 = (cryptECDHKeyAgreement) getinterfacedescriptor.L$0;
                ResultKt.onNavigationEvent(obj);
                cryptverifysignaturevaluePrevious = cryptverifysignaturevalue5;
                listIterator = listIterator3;
                it = it3;
                cryptecdhkeyagreement = cryptecdhkeyagreement3;
                if (it.hasNext()) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        if (r10.asInterface(r12, r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0127, code lost:
    
        if (r11.onNavigationEvent(r2, r10, r0) != r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013d, code lost:
    
        if (r11.asInterface(r12, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017c, code lost:
    
        if (r10.onNavigationEvent(r11, r12, r0) == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0140 -> B:27:0x00b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object onNavigationEvent(cryptECDHKeyAgreement cryptecdhkeyagreement, certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        IAuthTabCallback_Parcel iAuthTabCallback_Parcel;
        cryptVerifySignatureValue cryptverifysignaturevalue;
        certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo2;
        Iterator it;
        Set<certGetAuthorityKeyIdentifierInfo> set;
        cryptVerifySignatureValue cryptverifysignaturevalue2;
        certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo3;
        cryptECDHKeyAgreement cryptecdhkeyagreement2;
        Object next;
        if (access13800Var instanceof IAuthTabCallback_Parcel) {
            iAuthTabCallback_Parcel = (IAuthTabCallback_Parcel) access13800Var;
            int i = iAuthTabCallback_Parcel.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback_Parcel.label = i - 2147483648;
            } else {
                iAuthTabCallback_Parcel = cryptecdhkeyagreement.new IAuthTabCallback_Parcel(access13800Var);
            }
        }
        Object obj = iAuthTabCallback_Parcel.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        switch (iAuthTabCallback_Parcel.label) {
            case 0:
                ResultKt.onNavigationEvent(obj);
                if (certgetauthoritykeyidentifierinfo.onExtraCallbackWithResult().isEmpty()) {
                    iAuthTabCallback_Parcel.label = 1;
                    break;
                } else {
                    int i2 = onNavigationEvent.IAuthTabCallback[cryptecdhkeyagreement.IAuthTabCallback().ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            it = cryptecdhkeyagreement.IAuthTabCallback.asBinder().iterator();
                            if (it.hasNext()) {
                                cryptVerifySignatureValue cryptverifysignaturevalue3 = (cryptVerifySignatureValue) it.next();
                                Set<certGetAuthorityKeyIdentifierInfo> setOnExtraCallbackWithResult = certgetauthoritykeyidentifierinfo.onExtraCallbackWithResult();
                                iAuthTabCallback_Parcel.L$0 = cryptecdhkeyagreement;
                                iAuthTabCallback_Parcel.L$1 = certgetauthoritykeyidentifierinfo;
                                iAuthTabCallback_Parcel.L$2 = logicrenewcertgenmgenp;
                                iAuthTabCallback_Parcel.L$3 = it;
                                iAuthTabCallback_Parcel.L$4 = cryptverifysignaturevalue3;
                                iAuthTabCallback_Parcel.L$5 = setOnExtraCallbackWithResult;
                                iAuthTabCallback_Parcel.label = 4;
                                if (cryptecdhkeyagreement.IAuthTabCallback(cryptverifysignaturevalue3, logicrenewcertgenmgenp, iAuthTabCallback_Parcel) != objOnExtraCallback) {
                                    cryptecdhkeyagreement2 = cryptecdhkeyagreement;
                                    set = setOnExtraCallbackWithResult;
                                    certgetauthoritykeyidentifierinfo3 = certgetauthoritykeyidentifierinfo;
                                    cryptverifysignaturevalue2 = cryptverifysignaturevalue3;
                                    if (!(cryptverifysignaturevalue2 instanceof logicDisuseCertRr)) {
                                        Iterator<T> it2 = set.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                if (((certGetAuthorityKeyIdentifierInfo) next).onNavigationEvent() == cryptverifysignaturevalue2) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo4 = (certGetAuthorityKeyIdentifierInfo) next;
                                        if (certgetauthoritykeyidentifierinfo4 != null) {
                                            decryptRSA decryptrsaOnNavigationEvent = certGetCertUserNotice.onWarmupCompleted(certgetauthoritykeyidentifierinfo4).onNavigationEvent();
                                            Intrinsics.checkNotNull(decryptrsaOnNavigationEvent, "");
                                            logicRenewCertGenmGenp<?> logicrenewcertgenmgenpOnNavigationEvent = cert_Pkcs8Prikey.onNavigationEvent(logicrenewcertgenmgenp, (generateAesIV) decryptrsaOnNavigationEvent);
                                            iAuthTabCallback_Parcel.L$0 = cryptecdhkeyagreement2;
                                            iAuthTabCallback_Parcel.L$1 = certgetauthoritykeyidentifierinfo3;
                                            iAuthTabCallback_Parcel.L$2 = logicrenewcertgenmgenp;
                                            iAuthTabCallback_Parcel.L$3 = it;
                                            iAuthTabCallback_Parcel.L$4 = null;
                                            iAuthTabCallback_Parcel.L$5 = null;
                                            iAuthTabCallback_Parcel.label = 5;
                                            break;
                                        } else {
                                            iAuthTabCallback_Parcel.L$0 = cryptecdhkeyagreement2;
                                            iAuthTabCallback_Parcel.L$1 = certgetauthoritykeyidentifierinfo3;
                                            iAuthTabCallback_Parcel.L$2 = logicrenewcertgenmgenp;
                                            iAuthTabCallback_Parcel.L$3 = it;
                                            iAuthTabCallback_Parcel.L$4 = null;
                                            iAuthTabCallback_Parcel.L$5 = null;
                                            iAuthTabCallback_Parcel.label = 6;
                                            break;
                                        }
                                        if (it.hasNext()) {
                                        }
                                    }
                                    certgetauthoritykeyidentifierinfo = certgetauthoritykeyidentifierinfo3;
                                    cryptecdhkeyagreement = cryptecdhkeyagreement2;
                                    if (it.hasNext()) {
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo5 = (certGetAuthorityKeyIdentifierInfo) CollectionsKt___CollectionsKt.singleOrNull(certgetauthoritykeyidentifierinfo.onExtraCallbackWithResult());
                    if (certgetauthoritykeyidentifierinfo5 == null) {
                        throw new IllegalStateException(("Looks that you have specified multiple targets for exclusive state, which is not correct, calculated targets: " + CollectionsKt___CollectionsKt.joinToString$default(certgetauthoritykeyidentifierinfo.onExtraCallbackWithResult(), null, null, null, 0, null, access000.onExtraCallbackWithResult, 31, null) + ", parent: " + cryptecdhkeyagreement).toString());
                    }
                    decryptRSA decryptrsaOnNavigationEvent2 = certgetauthoritykeyidentifierinfo5.onNavigationEvent();
                    Intrinsics.checkNotNull(decryptrsaOnNavigationEvent2, "");
                    cryptVerifySignatureValue cryptverifysignaturevalue4 = (cryptVerifySignatureValue) decryptrsaOnNavigationEvent2;
                    iAuthTabCallback_Parcel.L$0 = logicrenewcertgenmgenp;
                    iAuthTabCallback_Parcel.L$1 = certgetauthoritykeyidentifierinfo5;
                    iAuthTabCallback_Parcel.L$2 = cryptverifysignaturevalue4;
                    iAuthTabCallback_Parcel.label = 2;
                    if (cryptecdhkeyagreement.onExtraCallback(cryptverifysignaturevalue4, logicrenewcertgenmgenp, iAuthTabCallback_Parcel) != objOnExtraCallback) {
                        cryptverifysignaturevalue = cryptverifysignaturevalue4;
                        certgetauthoritykeyidentifierinfo2 = certgetauthoritykeyidentifierinfo5;
                        if (!(cryptverifysignaturevalue instanceof logicDisuseCertRr)) {
                            iAuthTabCallback_Parcel.L$0 = null;
                            iAuthTabCallback_Parcel.L$1 = null;
                            iAuthTabCallback_Parcel.L$2 = null;
                            iAuthTabCallback_Parcel.label = 3;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                }
                return objOnExtraCallback;
            case 1:
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            case 2:
                cryptverifysignaturevalue = (cryptVerifySignatureValue) iAuthTabCallback_Parcel.L$2;
                certgetauthoritykeyidentifierinfo2 = (certGetAuthorityKeyIdentifierInfo) iAuthTabCallback_Parcel.L$1;
                logicrenewcertgenmgenp = (logicRenewCertGenmGenp) iAuthTabCallback_Parcel.L$0;
                ResultKt.onNavigationEvent(obj);
                if (!(cryptverifysignaturevalue instanceof logicDisuseCertRr)) {
                }
                return Unit.INSTANCE;
            case 3:
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            case 4:
                set = (Set) iAuthTabCallback_Parcel.L$5;
                cryptverifysignaturevalue2 = (cryptVerifySignatureValue) iAuthTabCallback_Parcel.L$4;
                Iterator it3 = (Iterator) iAuthTabCallback_Parcel.L$3;
                logicRenewCertGenmGenp<?> logicrenewcertgenmgenp2 = (logicRenewCertGenmGenp) iAuthTabCallback_Parcel.L$2;
                certgetauthoritykeyidentifierinfo3 = (certGetAuthorityKeyIdentifierInfo) iAuthTabCallback_Parcel.L$1;
                cryptecdhkeyagreement2 = (cryptECDHKeyAgreement) iAuthTabCallback_Parcel.L$0;
                ResultKt.onNavigationEvent(obj);
                it = it3;
                logicrenewcertgenmgenp = logicrenewcertgenmgenp2;
                if (!(cryptverifysignaturevalue2 instanceof logicDisuseCertRr)) {
                }
                certgetauthoritykeyidentifierinfo = certgetauthoritykeyidentifierinfo3;
                cryptecdhkeyagreement = cryptecdhkeyagreement2;
                if (it.hasNext()) {
                }
                return Unit.INSTANCE;
            case 5:
            case 6:
                Iterator it4 = (Iterator) iAuthTabCallback_Parcel.L$3;
                logicRenewCertGenmGenp<?> logicrenewcertgenmgenp3 = (logicRenewCertGenmGenp) iAuthTabCallback_Parcel.L$2;
                certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo6 = (certGetAuthorityKeyIdentifierInfo) iAuthTabCallback_Parcel.L$1;
                cryptECDHKeyAgreement cryptecdhkeyagreement3 = (cryptECDHKeyAgreement) iAuthTabCallback_Parcel.L$0;
                ResultKt.onNavigationEvent(obj);
                it = it4;
                cryptecdhkeyagreement = cryptecdhkeyagreement3;
                logicrenewcertgenmgenp = logicrenewcertgenmgenp3;
                certgetauthoritykeyidentifierinfo = certgetauthoritykeyidentifierinfo6;
                if (it.hasNext()) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class access000 extends Lambda implements Function1<certGetAuthorityKeyIdentifierInfo, CharSequence> {
        public static final access000 onExtraCallbackWithResult = new access000();

        access000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfo) {
            Intrinsics.checkNotNullParameter(certgetauthoritykeyidentifierinfo, "");
            return certgetauthoritykeyidentifierinfo.onNavigationEvent().toString();
        }
    }

    static final class ICustomTabsCallback extends SuspendLambda implements Function2<cryptVerifySignatureValue, access13800<? super Unit>, Object> {
        final /* synthetic */ logicRenewCertGenmGenp<?> $transitionParams;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ICustomTabsCallback(logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super ICustomTabsCallback> access13800Var) {
            super(2, access13800Var);
            this.$transitionParams = logicrenewcertgenmgenp;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(this.$transitionParams, access13800Var);
            iCustomTabsCallback.L$0 = obj;
            return iCustomTabsCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cryptVerifySignatureValue cryptverifysignaturevalue, access13800<? super Unit> access13800Var) {
            return ((ICustomTabsCallback) create(cryptverifysignaturevalue, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                cryptVerifySignatureValue cryptverifysignaturevalue = (cryptVerifySignatureValue) this.L$0;
                logicRenewCertGenmGenp<?> logicrenewcertgenmgenp = this.$transitionParams;
                this.label = 1;
                if (cryptverifysignaturevalue.IAuthTabCallbackDefault(logicrenewcertgenmgenp, this) == objOnExtraCallback) {
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r6.onNavigationEvent(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object IAuthTabCallbackStub(cryptECDHKeyAgreement cryptecdhkeyagreement, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        access100 access100Var;
        if (access13800Var instanceof access100) {
            access100Var = (access100) access13800Var;
            int i = access100Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                access100Var.label = i - 2147483648;
            } else {
                access100Var = cryptecdhkeyagreement.new access100(access13800Var);
            }
        }
        Object obj = access100Var.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = access100Var.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            List<cryptVerifySignatureValue> listOnNavigationEvent = cryptecdhkeyagreement.onNavigationEvent();
            ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(logicrenewcertgenmgenp, null);
            access100Var.L$0 = cryptecdhkeyagreement;
            access100Var.L$1 = logicrenewcertgenmgenp;
            access100Var.label = 1;
            if (certGetCertCPS.onWarmupCompleted(listOnNavigationEvent, iCustomTabsCallback, access100Var) != objOnExtraCallback) {
            }
            return objOnExtraCallback;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
        logicrenewcertgenmgenp = (logicRenewCertGenmGenp) access100Var.L$1;
        cryptecdhkeyagreement = (cryptECDHKeyAgreement) access100Var.L$0;
        ResultKt.onNavigationEvent(obj);
        access100Var.L$0 = null;
        access100Var.L$1 = null;
        access100Var.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (o.certGetCertCPS.onWarmupCompleted(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object onWarmupCompleted(cryptECDHKeyAgreement cryptecdhkeyagreement, access13800<? super Unit> access13800Var) {
        extraCallback extracallback;
        if (access13800Var instanceof extraCallback) {
            extracallback = (extraCallback) access13800Var;
            int i = extracallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                extracallback.label = i - 2147483648;
            } else {
                extracallback = cryptecdhkeyagreement.new extraCallback(access13800Var);
            }
        }
        Object obj = extracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = extracallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            cryptecdhkeyagreement.IAuthTabCallback.onWarmupCompleted((cryptVerifySignatureValue) null);
            cryptecdhkeyagreement.IAuthTabCallback.onWarmupCompleted(false);
            cryptecdhkeyagreement.IAuthTabCallback.onNavigationEvent(false);
            extracallback.L$0 = cryptecdhkeyagreement;
            extracallback.label = 1;
            if (cryptecdhkeyagreement.IAuthTabCallback(extracallback) != objOnExtraCallback) {
            }
            return objOnExtraCallback;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
        cryptecdhkeyagreement = (cryptECDHKeyAgreement) extracallback.L$0;
        ResultKt.onNavigationEvent(obj);
        Set<cryptVerifySignatureValue> setAsBinder = cryptecdhkeyagreement.IAuthTabCallback.asBinder();
        extraCallbackWithResult extracallbackwithresult = new extraCallbackWithResult(null);
        extracallback.L$0 = null;
        extracallback.label = 2;
    }

    static final class extraCallbackWithResult extends SuspendLambda implements Function2<cryptVerifySignatureValue, access13800<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        extraCallbackWithResult(access13800<? super extraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            extraCallbackWithResult extracallbackwithresult = new extraCallbackWithResult(access13800Var);
            extracallbackwithresult.L$0 = obj;
            return extracallbackwithresult;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cryptVerifySignatureValue cryptverifysignaturevalue, access13800<? super Unit> access13800Var) {
            return ((extraCallbackWithResult) create(cryptverifysignaturevalue, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                cryptVerifySignatureValue cryptverifysignaturevalue = (cryptVerifySignatureValue) this.L$0;
                this.label = 1;
                if (cryptverifysignaturevalue.onNavigationEvent(this) == objOnExtraCallback) {
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

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<cryptVerifySignatureValue, access13800<? super Unit>, Object> {
        final /* synthetic */ logicRenewCertGenmGenp<?> $transitionParams;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackDefault(logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$transitionParams = logicrenewcertgenmgenp;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(this.$transitionParams, access13800Var);
            iAuthTabCallbackDefault.L$0 = obj;
            return iAuthTabCallbackDefault;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cryptVerifySignatureValue cryptverifysignaturevalue, access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallbackDefault) create(cryptverifysignaturevalue, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                cryptVerifySignatureValue cryptverifysignaturevalue = (cryptVerifySignatureValue) this.L$0;
                logicRenewCertGenmGenp<?> logicrenewcertgenmgenp = this.$transitionParams;
                this.label = 1;
                if (cryptverifysignaturevalue.IAuthTabCallback(logicrenewcertgenmgenp, this) == objOnExtraCallback) {
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

    static /* synthetic */ Object IAuthTabCallback(cryptECDHKeyAgreement cryptecdhkeyagreement, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        Object objOnWarmupCompleted = certGetCertCPS.onWarmupCompleted(cryptecdhkeyagreement.IAuthTabCallback.asBinder(), new IAuthTabCallbackDefault(logicrenewcertgenmgenp, null), access13800Var);
        return objOnWarmupCompleted == access14100.onExtraCallback() ? objOnWarmupCompleted : Unit.INSTANCE;
    }

    @Override // o.cryptVerifySignatureValue
    public List<cryptVerifySignatureValue> onNavigationEvent() {
        int i = onNavigationEvent.IAuthTabCallback[IAuthTabCallback().ordinal()];
        if (i == 1) {
            return CollectionsKt__CollectionsKt.listOfNotNull(this.IAuthTabCallback.onNavigationEvent());
        }
        if (i == 2) {
            return CollectionsKt___CollectionsKt.toList(this.IAuthTabCallback.asBinder());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (IAuthTabCallback(r10, r9, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(cryptVerifySignatureValue cryptverifysignaturevalue, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        writeTypedObject writetypedobject;
        cryptVerifySignatureValue cryptverifysignaturevalue2;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp2;
        if (access13800Var instanceof writeTypedObject) {
            writetypedobject = (writeTypedObject) access13800Var;
            int i = writetypedobject.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                writetypedobject.label = i - 2147483648;
            } else {
                writetypedobject = new writeTypedObject(access13800Var);
            }
        }
        Object obj = writetypedobject.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = writetypedobject.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (IAuthTabCallback() != certVerifyCertificate.EXCLUSIVE) {
                throw new IllegalArgumentException(("Cannot set current state in child mode " + IAuthTabCallback()).toString());
            }
            if (!getInterfaceDescriptor().contains(cryptverifysignaturevalue)) {
                throw new IllegalArgumentException((cryptverifysignaturevalue + " is not a child of " + this).toString());
            }
            if (this.IAuthTabCallback.onNavigationEvent() == cryptverifysignaturevalue && logicrenewcertgenmgenp.onNavigationEvent().IAuthTabCallbackStub() != logicRenewCertResult.EXTERNAL) {
                return Unit.INSTANCE;
            }
            cryptVerifySignatureValue cryptverifysignaturevalueOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
            if (cryptverifysignaturevalueOnNavigationEvent != null) {
                writetypedobject.L$0 = cryptverifysignaturevalue;
                writetypedobject.L$1 = logicrenewcertgenmgenp;
                writetypedobject.label = 1;
                if (cryptverifysignaturevalueOnNavigationEvent.IAuthTabCallbackDefault(logicrenewcertgenmgenp, writetypedobject) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
        } else if (i2 == 1) {
            logicrenewcertgenmgenp = (logicRenewCertGenmGenp) writetypedobject.L$1;
            cryptverifysignaturevalue = (cryptVerifySignatureValue) writetypedobject.L$0;
            ResultKt.onNavigationEvent(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            logicrenewcertgenmgenp2 = (logicRenewCertGenmGenp) writetypedobject.L$1;
            cryptverifysignaturevalue2 = (cryptVerifySignatureValue) writetypedobject.L$0;
            ResultKt.onNavigationEvent(obj);
            writetypedobject.L$0 = null;
            writetypedobject.L$1 = null;
            writetypedobject.label = 3;
        }
        this.IAuthTabCallback.onWarmupCompleted(cryptverifysignaturevalue);
        Set<cryptVerifySignatureValue> setAsBinder = this.IAuthTabCallback.asBinder();
        onMessageChannelReady onmessagechannelready = new onMessageChannelReady(cryptverifysignaturevalue, null);
        writetypedobject.L$0 = cryptverifysignaturevalue;
        writetypedobject.L$1 = logicrenewcertgenmgenp;
        writetypedobject.label = 2;
        if (certGetCertCPS.onWarmupCompleted(setAsBinder, onmessagechannelready, writetypedobject) != objOnExtraCallback) {
            logicRenewCertGenmGenp<?> logicrenewcertgenmgenp3 = logicrenewcertgenmgenp;
            cryptverifysignaturevalue2 = cryptverifysignaturevalue;
            logicrenewcertgenmgenp2 = logicrenewcertgenmgenp3;
            writetypedobject.L$0 = null;
            writetypedobject.L$1 = null;
            writetypedobject.label = 3;
        }
        return objOnExtraCallback;
    }

    static final class onMessageChannelReady extends SuspendLambda implements Function2<cryptVerifySignatureValue, access13800<? super Unit>, Object> {
        final /* synthetic */ cryptVerifySignatureValue $state;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onMessageChannelReady(cryptVerifySignatureValue cryptverifysignaturevalue, access13800<? super onMessageChannelReady> access13800Var) {
            super(2, access13800Var);
            this.$state = cryptverifysignaturevalue;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cryptVerifySignatureValue cryptverifysignaturevalue, access13800<? super Unit> access13800Var) {
            return ((onMessageChannelReady) create(cryptverifysignaturevalue, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onMessageChannelReady onmessagechannelready = new onMessageChannelReady(this.$state, access13800Var);
            onmessagechannelready.L$0 = obj;
            return onmessagechannelready;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ((cryptVerifySignatureValue) this.L$0).IAuthTabCallback(this.$state);
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ Object IAuthTabCallback(cryptECDHKeyAgreement cryptecdhkeyagreement, access13800<? super Unit> access13800Var) {
        cryptecdhkeyagreement.IAuthTabCallback = new onWarmupCompleted();
        Object objOnExtraCallbackWithResult = cryptecdhkeyagreement.onExtraCallbackWithResult(access13800Var);
        return objOnExtraCallbackWithResult == access14100.onExtraCallback() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (r9.onWarmupCompleted(r7, r8, r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(cryptVerifySignatureValue cryptverifysignaturevalue, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        onTransact ontransact;
        ?? r10;
        cryptVerifySignatureValue cryptverifysignaturevalue2;
        int i;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp2;
        cryptVerifySignatureValue cryptverifysignaturevalueIAuthTabCallbackDefault;
        if (access13800Var instanceof onTransact) {
            ontransact = (onTransact) access13800Var;
            int i2 = ontransact.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ontransact.label = i2 - 2147483648;
            } else {
                ontransact = new onTransact(access13800Var);
            }
        }
        Object obj = ontransact.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i3 = ontransact.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            int i4 = onNavigationEvent.IAuthTabCallback[IAuthTabCallback().ordinal()];
            if (i4 == 1) {
                r10 = cryptverifysignaturevalue instanceof decryptSeed;
            } else if (i4 == 2) {
                Set<generateAesIV> interfaceDescriptor = getInterfaceDescriptor();
                if (!(interfaceDescriptor instanceof Collection) || !interfaceDescriptor.isEmpty()) {
                    Iterator<T> it = interfaceDescriptor.iterator();
                    while (it.hasNext()) {
                        if (!((generateAesIV) it.next()).writeTypedObject()) {
                            r10 = 0;
                            break;
                        }
                    }
                }
                r10 = 1;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this.IAuthTabCallback.onNavigationEvent((boolean) r10);
            ontransact.L$0 = cryptverifysignaturevalue;
            ontransact.L$1 = logicrenewcertgenmgenp;
            ontransact.I$0 = r10;
            ontransact.label = 1;
            if (cryptverifysignaturevalue.onWarmupCompleted(logicrenewcertgenmgenp, ontransact) != objOnExtraCallback) {
                cryptverifysignaturevalue2 = cryptverifysignaturevalue;
                i = r10;
            }
            return objOnExtraCallback;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            logicrenewcertgenmgenp2 = (logicRenewCertGenmGenp) ontransact.L$0;
            ResultKt.onNavigationEvent(obj);
            cryptverifysignaturevalueIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            if (cryptverifysignaturevalueIAuthTabCallbackDefault != null) {
                ontransact.L$0 = null;
                ontransact.label = 3;
            }
            return Unit.INSTANCE;
        }
        i = ontransact.I$0;
        logicrenewcertgenmgenp = (logicRenewCertGenmGenp) ontransact.L$1;
        cryptverifysignaturevalue2 = (cryptVerifySignatureValue) ontransact.L$0;
        ResultKt.onNavigationEvent(obj);
        if (i != 0) {
            ontransact.L$0 = logicrenewcertgenmgenp;
            ontransact.L$1 = null;
            ontransact.label = 2;
            if (onNavigationEvent(cryptverifysignaturevalue2, logicrenewcertgenmgenp, ontransact) != objOnExtraCallback) {
                logicrenewcertgenmgenp2 = logicrenewcertgenmgenp;
                cryptverifysignaturevalueIAuthTabCallbackDefault = IAuthTabCallbackDefault();
                if (cryptverifysignaturevalueIAuthTabCallbackDefault != null) {
                }
            }
            return objOnExtraCallback;
        }
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallbackStub extends Lambda implements Function0<String> {
        IAuthTabCallbackStub() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return cryptECDHKeyAgreement.this + " finished";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (o.cryptSeed.onExtraCallback(r11, r14, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0151, code lost:
    
        if (o.logicDisuseCertRr.onWarmupCompleted.onNavigationEvent(r4, r5, null, r7, 2, null) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015a, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(cryptVerifySignatureValue cryptverifysignaturevalue, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<? super Unit> access13800Var) {
        asInterface asinterface;
        cryptVerifySignatureValue cryptverifysignaturevalue2;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp2;
        getVIDRandom getvidrandom;
        Iterator it;
        logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub;
        asInterface asinterface2;
        cryptVerifySignatureValue cryptverifysignaturevalue3;
        logicRenewCertGenmGenp<?> logicrenewcertgenmgenp3;
        Iterator it2;
        logicDisuseCertRr logicdisusecertrr;
        if (access13800Var instanceof asInterface) {
            asinterface = (asInterface) access13800Var;
            int i = asinterface.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                asinterface.label = i - 2147483648;
            } else {
                asinterface = new asInterface(access13800Var);
            }
        }
        Object obj = asinterface.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = asinterface.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub();
            asinterface.L$0 = cryptverifysignaturevalue;
            asinterface.L$1 = logicrenewcertgenmgenp;
            asinterface.label = 1;
        } else if (i2 == 1) {
            logicrenewcertgenmgenp = (logicRenewCertGenmGenp) asinterface.L$1;
            cryptverifysignaturevalue = (cryptVerifySignatureValue) asinterface.L$0;
            ResultKt.onNavigationEvent(obj);
        } else if (i2 == 2) {
            getVIDRandom getvidrandom2 = (getVIDRandom) asinterface.L$4;
            it = (Iterator) asinterface.L$3;
            getVIDRandom getvidrandom3 = (getVIDRandom) asinterface.L$2;
            logicrenewcertgenmgenp2 = (logicRenewCertGenmGenp) asinterface.L$1;
            cryptverifysignaturevalue2 = (cryptVerifySignatureValue) asinterface.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (Exception e) {
                getvidrandom2.onExtraCallback(e);
            }
            getvidrandom = getvidrandom3;
            while (it.hasNext()) {
                generateAesIV.onExtraCallbackWithResult onextracallbackwithresult = (generateAesIV.onExtraCallbackWithResult) it.next();
                try {
                } catch (Exception e2) {
                    getvidrandom3 = getvidrandom;
                    getvidrandom.onExtraCallback(e2);
                }
                asinterface.L$0 = cryptverifysignaturevalue2;
                asinterface.L$1 = logicrenewcertgenmgenp2;
                asinterface.L$2 = getvidrandom;
                asinterface.L$3 = it;
                asinterface.L$4 = getvidrandom;
                asinterface.label = 2;
                if (onextracallbackwithresult.onNavigationEvent(logicrenewcertgenmgenp2, asinterface) == objOnExtraCallback) {
                    break;
                }
            }
            logicrenewcertgenmgenp = logicrenewcertgenmgenp2;
            cryptverifysignaturevalue = cryptverifysignaturevalue2;
            logicdisusecertrrIAuthTabCallbackStub = IAuthTabCallbackStub();
            Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub, "");
            if (!((getVIDRandom) logicdisusecertrrIAuthTabCallbackStub).extraCallbackWithResult()) {
                asinterface2 = asinterface;
                if (this instanceof logicDisuseCertRr) {
                }
            } else {
                cryptverifysignaturevalue3 = cryptverifysignaturevalue;
                logicrenewcertgenmgenp3 = logicrenewcertgenmgenp;
                it2 = CollectionsKt___CollectionsKt.toList(logicdisusecertrrIAuthTabCallbackStub.cG_()).iterator();
                logicdisusecertrr = logicdisusecertrrIAuthTabCallbackStub;
                while (it2.hasNext()) {
                }
                asinterface2 = asinterface;
                cryptverifysignaturevalue = cryptverifysignaturevalue3;
                if (this instanceof logicDisuseCertRr) {
                }
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            getVIDRandom getvidrandom4 = (getVIDRandom) asinterface.L$4;
            it2 = (Iterator) asinterface.L$3;
            logicdisusecertrr = (logicDisuseCertRr) asinterface.L$2;
            logicrenewcertgenmgenp3 = (logicRenewCertGenmGenp) asinterface.L$1;
            cryptverifysignaturevalue3 = (cryptVerifySignatureValue) asinterface.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
            } catch (Exception e3) {
                getvidrandom4.onExtraCallback(e3);
            }
            while (it2.hasNext()) {
                logicDisuseCertRr.IAuthTabCallback iAuthTabCallback = (logicDisuseCertRr.IAuthTabCallback) it2.next();
                getVIDRandom getvidrandom5 = (getVIDRandom) logicdisusecertrr;
                try {
                    asinterface.L$0 = cryptverifysignaturevalue3;
                    asinterface.L$1 = logicrenewcertgenmgenp3;
                    asinterface.L$2 = logicdisusecertrr;
                    asinterface.L$3 = it2;
                    asinterface.L$4 = getvidrandom5;
                    asinterface.label = 3;
                } catch (Exception e4) {
                    getvidrandom5.onExtraCallback(e4);
                }
                if (iAuthTabCallback.onNavigationEvent(this, logicrenewcertgenmgenp3, asinterface) == objOnExtraCallback) {
                    break;
                }
            }
            asinterface2 = asinterface;
            cryptverifysignaturevalue = cryptverifysignaturevalue3;
            if (this instanceof logicDisuseCertRr) {
                return Unit.INSTANCE;
            }
            logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub2 = IAuthTabCallbackStub();
            certGetPublicKey certgetpublickeyOnWarmupCompleted = onWarmupCompleted(cryptverifysignaturevalue);
            asinterface2.L$0 = null;
            asinterface2.L$1 = null;
            asinterface2.L$2 = null;
            asinterface2.L$3 = null;
            asinterface2.L$4 = null;
            asinterface2.label = 4;
        }
        logicDisuseCertRr logicdisusecertrrIAuthTabCallbackStub3 = IAuthTabCallbackStub();
        Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub3, "");
        getVIDRandom getvidrandom6 = (getVIDRandom) logicdisusecertrrIAuthTabCallbackStub3;
        if (!getvidrandom6.extraCallbackWithResult()) {
            cryptverifysignaturevalue2 = cryptverifysignaturevalue;
            logicrenewcertgenmgenp2 = logicrenewcertgenmgenp;
            getvidrandom = getvidrandom6;
            it = CollectionsKt___CollectionsKt.toList(asBinder()).iterator();
            while (it.hasNext()) {
            }
            logicrenewcertgenmgenp = logicrenewcertgenmgenp2;
            cryptverifysignaturevalue = cryptverifysignaturevalue2;
        }
        logicdisusecertrrIAuthTabCallbackStub = IAuthTabCallbackStub();
        Intrinsics.checkNotNull(logicdisusecertrrIAuthTabCallbackStub, "");
        if (!((getVIDRandom) logicdisusecertrrIAuthTabCallbackStub).extraCallbackWithResult()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final certGetPublicKey onWarmupCompleted(cryptVerifySignatureValue cryptverifysignaturevalue) {
        if (IAuthTabCallback() == certVerifyCertificate.EXCLUSIVE && (cryptverifysignaturevalue instanceof cryptGenerateMACWithSHA256) && (cryptverifysignaturevalue instanceof decryptSeed)) {
            return new certGetPublicKey(this, ((cryptGenerateMACWithSHA256) cryptverifysignaturevalue).onNavigationEvent());
        }
        return new certGetPublicKey(this, null, 2, null);
    }

    public final Object onNavigationEvent(@NotNull Set<? extends cryptVerifySignatureValue> set, @NotNull cryptVerifySignatureValue cryptverifysignaturevalue, @NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<? super Unit> access13800Var) {
        if (set.isEmpty()) {
            return Unit.INSTANCE;
        }
        if (set.size() == 1) {
            List<decryptRSA> listOnExtraCallbackWithResult = certGetCertUserNotice.onExtraCallbackWithResult(cryptverifysignaturevalue, (decryptRSA) CollectionsKt___CollectionsKt.single(set), logicrenewcertgenmgenp.onNavigationEvent().IAuthTabCallbackStub() == logicRenewCertResult.EXTERNAL);
            Intrinsics.checkNotNull(listOnExtraCallbackWithResult, "");
            ListIterator<decryptRSA> listIterator = listOnExtraCallbackWithResult.listIterator(listOnExtraCallbackWithResult.size());
            Object objOnExtraCallbackWithResult = ((cryptVerifySignatureValue) listIterator.previous()).onExtraCallbackWithResult(listIterator, logicrenewcertgenmgenp, access13800Var);
            return objOnExtraCallbackWithResult == access14100.onExtraCallback() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
        }
        certGetAuthorityKeyIdentifierInfo certgetauthoritykeyidentifierinfoOnNavigationEvent = certGetCertUserNotice.onNavigationEvent(cryptverifysignaturevalue, set, logicrenewcertgenmgenp.onNavigationEvent().IAuthTabCallbackStub() == logicRenewCertResult.EXTERNAL);
        decryptRSA decryptrsaOnNavigationEvent = certgetauthoritykeyidentifierinfoOnNavigationEvent.onNavigationEvent();
        Intrinsics.checkNotNull(decryptrsaOnNavigationEvent, "");
        Object objOnNavigationEvent = ((cryptVerifySignatureValue) decryptrsaOnNavigationEvent).onNavigationEvent(certgetauthoritykeyidentifierinfoOnNavigationEvent, logicrenewcertgenmgenp, access13800Var);
        return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
    }
}
