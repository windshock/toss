package o;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.regex.Pattern;
import net.sf.scuba.smartcards.BuildConfig;
import o.ycx41;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class uh8 implements uh4 {
    private static final Pattern onNavigationEvent = Pattern.compile("[^0-9A-Fa-f]");
    private final setVideoAdInteractionListener IAuthTabCallbackDefault;
    private ycx41 asBinder;
    private final lt12 asInterface;
    private boolean onExtraCallback = false;
    private int onWarmupCompleted = 0;
    private int getInterfaceDescriptor = 0;
    private int onExtraCallbackWithResult = -1;
    private boolean IAuthTabCallback = true;
    private final List<ycx41> access100 = new ArrayList(100);
    private final PAGLogoView<Integer> IAuthTabCallbackStub = new PAGLogoView<>(10);
    private final Map<Integer, lt13> onTransact = new LinkedHashMap();

    public uh8(setVideoAdInteractionListener setvideoadinteractionlistener, lt12 lt12Var) {
        this.asInterface = lt12Var;
        this.IAuthTabCallbackDefault = setvideoadinteractionlistener;
        isEngagementSignalsApiAvailable();
    }

    public boolean onWarmupCompleted(ycx41.IAuthTabCallback iAuthTabCallback) {
        while (prefetch()) {
            ICustomTabsCallbackDefault();
        }
        return !this.access100.isEmpty() && this.access100.get(0).onNavigationEvent() == iAuthTabCallback;
    }

    public boolean onExtraCallback(ycx41.IAuthTabCallback... iAuthTabCallbackArr) {
        while (prefetch()) {
            ICustomTabsCallbackDefault();
        }
        if (!this.access100.isEmpty()) {
            if (iAuthTabCallbackArr.length == 0) {
                return true;
            }
            ycx41.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = this.access100.get(0).onNavigationEvent();
            for (ycx41.IAuthTabCallback iAuthTabCallback : iAuthTabCallbackArr) {
                if (iAuthTabCallbackOnNavigationEvent == iAuthTabCallback) {
                    return true;
                }
            }
        }
        return false;
    }

    public ycx41 onExtraCallback() {
        while (prefetch()) {
            ICustomTabsCallbackDefault();
        }
        return this.access100.get(0);
    }

    public boolean hasNext() {
        return onExtraCallback(new ycx41.IAuthTabCallback[0]);
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public ycx41 next() {
        this.getInterfaceDescriptor++;
        if (this.access100.isEmpty()) {
            throw new NoSuchElementException("No more Tokens found.");
        }
        return this.access100.remove(0);
    }

    private void IAuthTabCallback(ycx41 ycx41Var) {
        this.asBinder = ycx41Var;
        this.access100.add(ycx41Var);
    }

    private void IAuthTabCallback(int i, ycx41 ycx41Var) {
        if (i == this.access100.size()) {
            this.asBinder = ycx41Var;
        }
        this.access100.add(i, ycx41Var);
    }

    private void onNavigationEvent(List<ycx41> list) {
        this.asBinder = list.get(list.size() - 1);
        this.access100.addAll(list);
    }

    private boolean extraCommand() {
        return this.onWarmupCompleted == 0;
    }

    private boolean mayLaunchUrl() {
        return !extraCommand();
    }

    private boolean prefetch() {
        if (this.onExtraCallback) {
            return false;
        }
        if (this.access100.isEmpty()) {
            return true;
        }
        updateVisuals();
        return newAuthTabSession() == this.getInterfaceDescriptor;
    }

    private void ICustomTabsCallbackDefault() {
        if (this.asInterface.onExtraCallbackWithResult() > this.IAuthTabCallbackDefault.onExtraCallback()) {
            throw new uh16("The incoming YAML document exceeds the limit: " + this.IAuthTabCallbackDefault.onExtraCallback() + " code points.");
        }
        validateRelationship();
        updateVisuals();
        onExtraCallbackWithResult(this.asInterface.IAuthTabCallback());
        int iAsBinder = this.asInterface.asBinder();
        if (iAsBinder == 0) {
            onRelationshipValidationResult();
            return;
        }
        if (iAsBinder == 42) {
            IAuthTabCallbackStubProxy();
            return;
        }
        if (iAsBinder != 58) {
            if (iAsBinder == 91) {
                onMinimized();
                return;
            }
            if (iAsBinder == 93) {
                onActivityResized();
                return;
            }
            if (iAsBinder == 33) {
                ICustomTabsService();
                return;
            }
            if (iAsBinder == 34) {
                readTypedObject();
                return;
            }
            if (iAsBinder != 62) {
                if (iAsBinder != 63) {
                    switch (iAsBinder) {
                        case 37:
                            if (onTransact()) {
                                access000();
                                return;
                            }
                            break;
                        case 38:
                            IAuthTabCallback_Parcel();
                            return;
                        case 39:
                            ICustomTabsCallbackStubProxy();
                            return;
                        default:
                            switch (iAsBinder) {
                                case 44:
                                    writeTypedObject();
                                    return;
                                case 45:
                                    if (IAuthTabCallbackDefault()) {
                                        extraCallback();
                                        return;
                                    } else if (IAuthTabCallback()) {
                                        getInterfaceDescriptor();
                                        return;
                                    }
                                    break;
                                case 46:
                                    if (asBinder()) {
                                        extraCallbackWithResult();
                                        return;
                                    }
                                    break;
                                default:
                                    switch (iAsBinder) {
                                        case 123:
                                            onActivityLayout();
                                            return;
                                        case 124:
                                            if (extraCommand()) {
                                                ICustomTabsCallbackStub();
                                                return;
                                            }
                                            break;
                                        case 125:
                                            ICustomTabsCallback();
                                            return;
                                    }
                            }
                    }
                } else if (asInterface()) {
                    onMessageChannelReady();
                    return;
                }
            } else if (extraCommand()) {
                onPostMessage();
                return;
            }
        } else if (access100()) {
            ICustomTabsCallback_Parcel();
            return;
        }
        if (IAuthTabCallbackStub()) {
            onUnminimized();
            return;
        }
        String strOnExtraCallback = sya61.onExtraCallback(String.valueOf(Character.toChars(iAsBinder)));
        if (iAsBinder == 9) {
            strOnExtraCallback = strOnExtraCallback + "(TAB)";
        }
        throw new uh15("while scanning for the next token", Optional.empty(), String.format("found character '%s' that cannot start any token. (Do not use %s for indentation)", strOnExtraCallback, strOnExtraCallback), this.asInterface.IAuthTabCallbackStub());
    }

    private int newAuthTabSession() {
        if (this.onTransact.isEmpty()) {
            return -1;
        }
        return this.onTransact.values().iterator().next().onNavigationEvent();
    }

    private void updateVisuals() {
        if (this.onTransact.isEmpty()) {
            return;
        }
        Iterator<lt13> it = this.onTransact.values().iterator();
        while (it.hasNext()) {
            lt13 next = it.next();
            if (next.IAuthTabCallback() != this.asInterface.onNavigationEvent() || this.asInterface.onExtraCallback() - next.onExtraCallbackWithResult() > 1024) {
                if (next.IAuthTabCallbackDefault()) {
                    throw new uh15("while scanning a simple key", next.onExtraCallback(), "could not find expected ':'", this.asInterface.IAuthTabCallbackStub());
                }
                it.remove();
            }
        }
    }

    private void newSessionWithExtras() {
        boolean z = extraCommand() && this.onExtraCallbackWithResult == this.asInterface.IAuthTabCallback();
        boolean z2 = this.IAuthTabCallback;
        if (!z2 && z) {
            throw new uh16("A simple key is required only if it is the first token in the current line");
        }
        if (z2) {
            newSession();
            this.onTransact.put(Integer.valueOf(this.onWarmupCompleted), new lt13(this.getInterfaceDescriptor + this.access100.size(), z, this.asInterface.onExtraCallback(), this.asInterface.onNavigationEvent(), this.asInterface.IAuthTabCallback(), this.asInterface.IAuthTabCallbackStub()));
        }
    }

    private void newSession() {
        lt13 lt13VarRemove = this.onTransact.remove(Integer.valueOf(this.onWarmupCompleted));
        if (lt13VarRemove != null && lt13VarRemove.IAuthTabCallbackDefault()) {
            throw new uh15("while scanning a simple key", lt13VarRemove.onExtraCallback(), "could not find expected ':'", this.asInterface.IAuthTabCallbackStub());
        }
    }

    private void onExtraCallbackWithResult(int i) {
        if (mayLaunchUrl()) {
            return;
        }
        while (this.onExtraCallbackWithResult > i) {
            Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
            this.onExtraCallbackWithResult = this.IAuthTabCallbackStub.onNavigationEvent().intValue();
            IAuthTabCallback(new dj41(optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub));
        }
    }

    private boolean onWarmupCompleted(int i) {
        int i2 = this.onExtraCallbackWithResult;
        if (i2 >= i) {
            return false;
        }
        this.IAuthTabCallbackStub.onExtraCallback(Integer.valueOf(i2));
        this.onExtraCallbackWithResult = i;
        return true;
    }

    private void isEngagementSignalsApiAvailable() {
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        IAuthTabCallback(new IPBroadcastReceiver11(optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub));
    }

    private void onRelationshipValidationResult() {
        onExtraCallbackWithResult(-1);
        newSession();
        this.IAuthTabCallback = false;
        this.onTransact.clear();
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        IAuthTabCallback(new IPBroadcastReceiver2(optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub));
        this.onExtraCallback = true;
    }

    private void access000() {
        onExtraCallbackWithResult(-1);
        newSession();
        this.IAuthTabCallback = false;
        onNavigationEvent(requestPostMessageChannel());
    }

    private void extraCallback() {
        IAuthTabCallback(true);
    }

    private void extraCallbackWithResult() {
        IAuthTabCallback(false);
    }

    private void IAuthTabCallback(boolean z) {
        ycx41 ycx521Var;
        onExtraCallbackWithResult(-1);
        newSession();
        this.IAuthTabCallback = false;
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        this.asInterface.onNavigationEvent(3);
        Optional<sya8> optionalIAuthTabCallbackStub2 = this.asInterface.IAuthTabCallbackStub();
        if (z) {
            ycx521Var = new lud22(optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub2);
        } else {
            ycx521Var = new ycx521(optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub2);
        }
        IAuthTabCallback(ycx521Var);
    }

    private void onMinimized() {
        onNavigationEvent(false);
    }

    private void onActivityLayout() {
        onNavigationEvent(true);
    }

    private void onNavigationEvent(boolean z) {
        ycx41 ycx31Var;
        newSessionWithExtras();
        this.onWarmupCompleted++;
        this.IAuthTabCallback = true;
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        this.asInterface.onNavigationEvent(1);
        Optional<sya8> optionalIAuthTabCallbackStub2 = this.asInterface.IAuthTabCallbackStub();
        if (z) {
            ycx31Var = new djycxycx(optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub2);
        } else {
            ycx31Var = new ycx31(optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub2);
        }
        IAuthTabCallback(ycx31Var);
    }

    private void onActivityResized() {
        onExtraCallback(false);
    }

    private void ICustomTabsCallback() {
        onExtraCallback(true);
    }

    private void onExtraCallback(boolean z) {
        ycx41 zb41Var;
        newSession();
        this.onWarmupCompleted--;
        this.IAuthTabCallback = false;
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        this.asInterface.onWarmupCompleted();
        Optional<sya8> optionalIAuthTabCallbackStub2 = this.asInterface.IAuthTabCallbackStub();
        if (z) {
            zb41Var = new ycx52(optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub2);
        } else {
            zb41Var = new zb41(optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub2);
        }
        IAuthTabCallback(zb41Var);
    }

    private void writeTypedObject() {
        this.IAuthTabCallback = true;
        newSession();
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        this.asInterface.onWarmupCompleted();
        IAuthTabCallback(new ycx51(optionalIAuthTabCallbackStub, this.asInterface.IAuthTabCallbackStub()));
    }

    private void getInterfaceDescriptor() {
        if (extraCommand()) {
            if (!this.IAuthTabCallback) {
                throw new uh15(BuildConfig.FLAVOR, Optional.empty(), "sequence entries are not allowed here", this.asInterface.IAuthTabCallbackStub());
            }
            if (onWarmupCompleted(this.asInterface.IAuthTabCallback())) {
                Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
                IAuthTabCallback(new dj42(optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub));
            }
        }
        this.IAuthTabCallback = true;
        newSession();
        Optional<sya8> optionalIAuthTabCallbackStub2 = this.asInterface.IAuthTabCallbackStub();
        this.asInterface.onWarmupCompleted();
        IAuthTabCallback(new lud21(optionalIAuthTabCallbackStub2, this.asInterface.IAuthTabCallbackStub()));
    }

    private void onMessageChannelReady() {
        if (extraCommand()) {
            if (!this.IAuthTabCallback) {
                throw new uh15("mapping keys are not allowed here", this.asInterface.IAuthTabCallbackStub());
            }
            if (onWarmupCompleted(this.asInterface.IAuthTabCallback())) {
                Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
                IAuthTabCallback(new dj43(optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub));
            }
        }
        this.IAuthTabCallback = extraCommand();
        newSession();
        Optional<sya8> optionalIAuthTabCallbackStub2 = this.asInterface.IAuthTabCallbackStub();
        this.asInterface.onWarmupCompleted();
        IAuthTabCallback(new zb61(optionalIAuthTabCallbackStub2, this.asInterface.IAuthTabCallbackStub()));
    }

    private void ICustomTabsCallback_Parcel() {
        lt13 lt13VarRemove = this.onTransact.remove(Integer.valueOf(this.onWarmupCompleted));
        if (lt13VarRemove != null) {
            IAuthTabCallback(lt13VarRemove.onNavigationEvent() - this.getInterfaceDescriptor, new zb61(lt13VarRemove.onExtraCallback(), lt13VarRemove.onExtraCallback()));
            if (extraCommand() && onWarmupCompleted(lt13VarRemove.onWarmupCompleted())) {
                IAuthTabCallback(lt13VarRemove.onNavigationEvent() - this.getInterfaceDescriptor, new dj43(lt13VarRemove.onExtraCallback(), lt13VarRemove.onExtraCallback()));
            }
            this.IAuthTabCallback = false;
        } else {
            if (extraCommand() && !this.IAuthTabCallback) {
                throw new uh15("mapping values are not allowed here", this.asInterface.IAuthTabCallbackStub());
            }
            if (extraCommand() && onWarmupCompleted(this.asInterface.IAuthTabCallback())) {
                Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
                IAuthTabCallback(new dj43(optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub));
            }
            this.IAuthTabCallback = extraCommand();
            newSession();
        }
        Optional<sya8> optionalIAuthTabCallbackStub2 = this.asInterface.IAuthTabCallbackStub();
        this.asInterface.onWarmupCompleted();
        IAuthTabCallback(new dy10(optionalIAuthTabCallbackStub2, this.asInterface.IAuthTabCallbackStub()));
    }

    private void IAuthTabCallbackStubProxy() {
        newSessionWithExtras();
        this.IAuthTabCallback = false;
        IAuthTabCallback(onExtraCallbackWithResult(false));
    }

    private void IAuthTabCallback_Parcel() {
        newSessionWithExtras();
        this.IAuthTabCallback = false;
        IAuthTabCallback(onExtraCallbackWithResult(true));
    }

    private void ICustomTabsService() {
        newSessionWithExtras();
        this.IAuthTabCallback = false;
        IAuthTabCallback(requestPostMessageChannelWithExtras());
    }

    private void ICustomTabsCallbackStub() {
        onExtraCallbackWithResult(sya6.LITERAL);
    }

    private void onPostMessage() {
        onExtraCallbackWithResult(sya6.FOLDED);
    }

    private void onExtraCallbackWithResult(sya6 sya6Var) {
        this.IAuthTabCallback = true;
        newSession();
        onNavigationEvent(onNavigationEvent(sya6Var));
    }

    private void ICustomTabsCallbackStubProxy() {
        IAuthTabCallback(sya6.SINGLE_QUOTED);
    }

    private void readTypedObject() {
        IAuthTabCallback(sya6.DOUBLE_QUOTED);
    }

    private void IAuthTabCallback(sya6 sya6Var) {
        newSessionWithExtras();
        this.IAuthTabCallback = false;
        IAuthTabCallback(onExtraCallback(sya6Var));
    }

    private void onUnminimized() {
        newSessionWithExtras();
        this.IAuthTabCallback = false;
        IAuthTabCallback(receiveFile());
    }

    private boolean onTransact() {
        return this.asInterface.IAuthTabCallback() == 0;
    }

    private boolean IAuthTabCallbackDefault() {
        return this.asInterface.IAuthTabCallback() == 0 && "---".equals(this.asInterface.onExtraCallback(3)) && sya61.onTransact.onExtraCallbackWithResult(this.asInterface.onExtraCallbackWithResult(3));
    }

    private boolean asBinder() {
        return this.asInterface.IAuthTabCallback() == 0 && "...".equals(this.asInterface.onExtraCallback(3)) && sya61.onTransact.onExtraCallbackWithResult(this.asInterface.onExtraCallbackWithResult(3));
    }

    private boolean IAuthTabCallback() {
        return sya61.onTransact.onExtraCallbackWithResult(this.asInterface.onExtraCallbackWithResult(1));
    }

    private boolean asInterface() {
        return sya61.onTransact.onExtraCallbackWithResult(this.asInterface.onExtraCallbackWithResult(1));
    }

    private boolean access100() {
        if (mayLaunchUrl()) {
            return true;
        }
        return sya61.onTransact.onExtraCallbackWithResult(this.asInterface.onExtraCallbackWithResult(1));
    }

    private boolean IAuthTabCallbackStub() {
        int iAsBinder = this.asInterface.asBinder();
        sya61 sya61Var = sya61.onTransact;
        if (sya61Var.onWarmupCompleted(iAsBinder, "-?:,[]{}#&*!|>'\"%@`")) {
            return true;
        }
        return extraCommand() ? sya61Var.onNavigationEvent(this.asInterface.onExtraCallbackWithResult(1)) && "-?:".indexOf(iAsBinder) != -1 : sya61Var.onWarmupCompleted(this.asInterface.onExtraCallbackWithResult(1), ",]") && "-?".indexOf(iAsBinder) != -1;
    }

    private void validateRelationship() {
        boolean z;
        sya17 sya17Var;
        int iIAuthTabCallback;
        ycx41 ycx41Var;
        if (this.asInterface.onExtraCallback() == 0 && this.asInterface.asBinder() == 65279) {
            this.asInterface.onWarmupCompleted();
        }
        int i = -1;
        boolean z2 = false;
        while (!z2) {
            Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
            int iIAuthTabCallback2 = this.asInterface.IAuthTabCallback();
            int i2 = 0;
            while (this.asInterface.onExtraCallbackWithResult(i2) == 32) {
                i2++;
            }
            if (i2 > 0) {
                this.asInterface.onNavigationEvent(i2);
            }
            if (this.asInterface.asBinder() == 35) {
                if (iIAuthTabCallback2 != 0 && ((ycx41Var = this.asBinder) == null || ycx41Var.onNavigationEvent() != ycx41.IAuthTabCallback.BlockEntry)) {
                    sya17Var = sya17.IN_LINE;
                    iIAuthTabCallback = this.asInterface.IAuthTabCallback();
                } else if (i == this.asInterface.IAuthTabCallback()) {
                    iIAuthTabCallback = i;
                    sya17Var = sya17.IN_LINE;
                } else {
                    sya17Var = sya17.BLOCK;
                    iIAuthTabCallback = -1;
                }
                lt34 lt34VarOnExtraCallbackWithResult = onExtraCallbackWithResult(sya17Var);
                if (this.IAuthTabCallbackDefault.IAuthTabCallback_Parcel()) {
                    IAuthTabCallback(lt34VarOnExtraCallbackWithResult);
                }
                i = iIAuthTabCallback;
                z = true;
            } else {
                z = false;
            }
            Optional<String> engagementSignalsCallback = setEngagementSignalsCallback();
            if (engagementSignalsCallback.isPresent()) {
                if (this.IAuthTabCallbackDefault.IAuthTabCallback_Parcel() && !z && iIAuthTabCallback2 == 0) {
                    IAuthTabCallback(new lt34(sya17.BLANK_LINE, engagementSignalsCallback.get(), optionalIAuthTabCallbackStub, this.asInterface.IAuthTabCallbackStub()));
                }
                if (extraCommand()) {
                    this.IAuthTabCallback = true;
                }
            } else {
                z2 = true;
            }
        }
    }

    private lt34 onExtraCallbackWithResult(sya17 sya17Var) {
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        this.asInterface.onWarmupCompleted();
        int i = 0;
        while (sya61.IAuthTabCallbackDefault.onNavigationEvent(this.asInterface.onExtraCallbackWithResult(i))) {
            i++;
        }
        return new lt34(sya17Var, this.asInterface.IAuthTabCallback(i), optionalIAuthTabCallbackStub, this.asInterface.IAuthTabCallbackStub());
    }

    private List<ycx41> requestPostMessageChannel() {
        Optional<sya8> optionalIAuthTabCallbackStub;
        Optional optionalEmpty;
        Optional<sya8> optionalIAuthTabCallbackStub2 = this.asInterface.IAuthTabCallbackStub();
        this.asInterface.onWarmupCompleted();
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(optionalIAuthTabCallbackStub2);
        if ("YAML".equals(strOnExtraCallbackWithResult)) {
            optionalEmpty = Optional.of(onTransact(optionalIAuthTabCallbackStub2));
            optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        } else if ("TAG".equals(strOnExtraCallbackWithResult)) {
            optionalEmpty = Optional.of(IAuthTabCallbackDefault(optionalIAuthTabCallbackStub2));
            optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        } else {
            optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
            int i = 0;
            while (sya61.IAuthTabCallbackDefault.onNavigationEvent(this.asInterface.onExtraCallbackWithResult(i))) {
                i++;
            }
            if (i > 0) {
                this.asInterface.onNavigationEvent(i);
            }
            optionalEmpty = Optional.empty();
        }
        return onExtraCallback(new lud23(strOnExtraCallbackWithResult, optionalEmpty, optionalIAuthTabCallbackStub2, optionalIAuthTabCallbackStub), onExtraCallback(optionalIAuthTabCallbackStub2));
    }

    private String onExtraCallbackWithResult(Optional<sya8> optional) {
        int i = 0;
        int iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(0);
        while (sya61.onNavigationEvent.onExtraCallbackWithResult(iOnExtraCallbackWithResult)) {
            i++;
            iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(i);
        }
        if (i == 0) {
            throw new uh15("while scanning a directive", optional, "expected alphabetic or numeric character, but found " + String.valueOf(Character.toChars(iOnExtraCallbackWithResult)) + "(" + iOnExtraCallbackWithResult + ")", this.asInterface.IAuthTabCallbackStub());
        }
        String strIAuthTabCallback = this.asInterface.IAuthTabCallback(i);
        int iAsBinder = this.asInterface.asBinder();
        if (!sya61.IAuthTabCallback.onNavigationEvent(iAsBinder)) {
            return strIAuthTabCallback;
        }
        throw new uh15("while scanning a directive", optional, "expected alphabetic or numeric character, but found " + String.valueOf(Character.toChars(iAsBinder)) + "(" + iAsBinder + ")", this.asInterface.IAuthTabCallbackStub());
    }

    private List<Integer> onTransact(Optional<sya8> optional) {
        while (this.asInterface.asBinder() == 32) {
            this.asInterface.onWarmupCompleted();
        }
        Integer numAsBinder = asBinder(optional);
        int iAsBinder = this.asInterface.asBinder();
        if (iAsBinder != 46) {
            throw new uh15("while scanning a directive", optional, "expected a digit or '.', but found " + String.valueOf(Character.toChars(iAsBinder)) + "(" + iAsBinder + ")", this.asInterface.IAuthTabCallbackStub());
        }
        this.asInterface.onWarmupCompleted();
        Integer numAsBinder2 = asBinder(optional);
        int iAsBinder2 = this.asInterface.asBinder();
        if (sya61.IAuthTabCallback.onNavigationEvent(iAsBinder2)) {
            throw new uh15("while scanning a directive", optional, "expected a digit or ' ', but found " + String.valueOf(Character.toChars(iAsBinder2)) + "(" + iAsBinder2 + ")", this.asInterface.IAuthTabCallbackStub());
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(numAsBinder);
        arrayList.add(numAsBinder2);
        return arrayList;
    }

    private Integer asBinder(Optional<sya8> optional) {
        int iAsBinder = this.asInterface.asBinder();
        if (!Character.isDigit(iAsBinder)) {
            throw new uh15("while scanning a directive", optional, "expected a digit, but found " + String.valueOf(Character.toChars(iAsBinder)) + "(" + iAsBinder + ")", this.asInterface.IAuthTabCallbackStub());
        }
        int i = 0;
        while (Character.isDigit(this.asInterface.onExtraCallbackWithResult(i))) {
            i++;
        }
        String strIAuthTabCallback = this.asInterface.IAuthTabCallback(i);
        if (i > 3) {
            throw new uh15("while scanning a YAML directive", optional, "found a number which cannot represent a valid version: " + strIAuthTabCallback, this.asInterface.IAuthTabCallbackStub());
        }
        return Integer.valueOf(Integer.parseInt(strIAuthTabCallback));
    }

    private List<String> IAuthTabCallbackDefault(Optional<sya8> optional) {
        while (this.asInterface.asBinder() == 32) {
            this.asInterface.onWarmupCompleted();
        }
        String strIAuthTabCallbackStub = IAuthTabCallbackStub(optional);
        while (this.asInterface.asBinder() == 32) {
            this.asInterface.onWarmupCompleted();
        }
        String strAsInterface = asInterface(optional);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(strIAuthTabCallbackStub);
        arrayList.add(strAsInterface);
        return arrayList;
    }

    private String IAuthTabCallbackStub(Optional<sya8> optional) {
        String strOnWarmupCompleted = onWarmupCompleted("directive", optional);
        int iAsBinder = this.asInterface.asBinder();
        if (iAsBinder == 32) {
            return strOnWarmupCompleted;
        }
        throw new uh15("while scanning a directive", optional, "expected ' ', but found " + String.valueOf(Character.toChars(iAsBinder)) + "(" + iAsBinder + ")", this.asInterface.IAuthTabCallbackStub());
    }

    private String asInterface(Optional<sya8> optional) {
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult("directive", sya61.asInterface, optional);
        int iAsBinder = this.asInterface.asBinder();
        if (!sya61.IAuthTabCallback.onNavigationEvent(iAsBinder)) {
            return strOnExtraCallbackWithResult;
        }
        throw new uh15("while scanning a directive", optional, "expected ' ', but found " + String.valueOf(Character.toChars(iAsBinder)) + "(" + iAsBinder + ")", this.asInterface.IAuthTabCallbackStub());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private lt34 onExtraCallback(Optional<sya8> optional) {
        lt34 lt34VarOnExtraCallbackWithResult;
        while (this.asInterface.asBinder() == 32) {
            this.asInterface.onWarmupCompleted();
        }
        if (this.asInterface.asBinder() == 35) {
            lt34VarOnExtraCallbackWithResult = onExtraCallbackWithResult(sya17.IN_LINE);
            if (!this.IAuthTabCallbackDefault.IAuthTabCallback_Parcel()) {
                lt34VarOnExtraCallbackWithResult = null;
            }
        }
        int iAsBinder = this.asInterface.asBinder();
        if (setEngagementSignalsCallback().isPresent() || iAsBinder == 0) {
            return lt34VarOnExtraCallbackWithResult;
        }
        throw new uh15("while scanning a directive", optional, "expected a comment or a line break, but found " + String.valueOf(Character.toChars(iAsBinder)) + "(" + iAsBinder + ")", this.asInterface.IAuthTabCallbackStub());
    }

    private ycx41 onExtraCallbackWithResult(boolean z) {
        sya61 sya61Var;
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        String str = this.asInterface.asBinder() == 42 ? "alias" : "anchor";
        this.asInterface.onWarmupCompleted();
        int i = 0;
        int iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(0);
        while (true) {
            sya61Var = sya61.onTransact;
            if (!sya61Var.onWarmupCompleted(iOnExtraCallbackWithResult, ",[]{}/.*&")) {
                break;
            }
            i++;
            iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(i);
        }
        if (i == 0) {
            throw new uh15("while scanning an " + str, optionalIAuthTabCallbackStub, "unexpected character found " + String.valueOf(Character.toChars(iOnExtraCallbackWithResult)) + "(" + iOnExtraCallbackWithResult + ")", this.asInterface.IAuthTabCallbackStub());
        }
        String strIAuthTabCallback = this.asInterface.IAuthTabCallback(i);
        int iAsBinder = this.asInterface.asBinder();
        if (sya61Var.onWarmupCompleted(iAsBinder, "?:,]}%@`")) {
            throw new uh15("while scanning an " + str, optionalIAuthTabCallbackStub, "unexpected character found " + String.valueOf(Character.toChars(iAsBinder)) + "(" + iAsBinder + ")", this.asInterface.IAuthTabCallbackStub());
        }
        Optional<sya8> optionalIAuthTabCallbackStub2 = this.asInterface.IAuthTabCallbackStub();
        if (z) {
            return new lt31(new sya18(strIAuthTabCallback), optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub2);
        }
        return new lt32(new sya18(strIAuthTabCallback), optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub2);
    }

    private ycx41 requestPostMessageChannelWithExtras() {
        String strOnExtraCallbackWithResult;
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        int iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(1);
        String strOnWarmupCompleted = null;
        if (iOnExtraCallbackWithResult == 60) {
            this.asInterface.onNavigationEvent(2);
            strOnExtraCallbackWithResult = onExtraCallbackWithResult("tag", sya61.asInterface, optionalIAuthTabCallbackStub);
            int iAsBinder = this.asInterface.asBinder();
            if (iAsBinder != 62) {
                throw new uh15("while scanning a tag", optionalIAuthTabCallbackStub, "expected '>', but found '" + String.valueOf(Character.toChars(iAsBinder)) + "' (" + iAsBinder + ")", this.asInterface.IAuthTabCallbackStub());
            }
            this.asInterface.onWarmupCompleted();
        } else if (sya61.onTransact.onExtraCallbackWithResult(iOnExtraCallbackWithResult)) {
            this.asInterface.onWarmupCompleted();
            strOnExtraCallbackWithResult = "!";
        } else {
            int i = 1;
            while (true) {
                if (!sya61.IAuthTabCallback.onNavigationEvent(iOnExtraCallbackWithResult)) {
                    this.asInterface.onWarmupCompleted();
                    strOnWarmupCompleted = "!";
                    break;
                }
                if (iOnExtraCallbackWithResult != 33) {
                    i++;
                    iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(i);
                } else {
                    strOnWarmupCompleted = onWarmupCompleted("tag", optionalIAuthTabCallbackStub);
                    break;
                }
            }
            strOnExtraCallbackWithResult = onExtraCallbackWithResult("tag", sya61.IAuthTabCallbackStub, optionalIAuthTabCallbackStub);
        }
        int iAsBinder2 = this.asInterface.asBinder();
        if (sya61.IAuthTabCallback.onNavigationEvent(iAsBinder2)) {
            throw new uh15("while scanning a tag", optionalIAuthTabCallbackStub, "expected ' ', but found '" + String.valueOf(Character.toChars(iAsBinder2)) + "' (" + iAsBinder2 + ")", this.asInterface.IAuthTabCallbackStub());
        }
        return new IPBroadcastReceiver(new IPBroadcastReceiver1(Optional.ofNullable(strOnWarmupCompleted), strOnExtraCallbackWithResult), optionalIAuthTabCallbackStub, this.asInterface.IAuthTabCallbackStub());
    }

    private List<ycx41> onNavigationEvent(sya6 sya6Var) throws NumberFormatException {
        String str;
        Optional optional;
        int iMax;
        Optional optional2;
        StringBuilder sb = new StringBuilder();
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        this.asInterface.onWarmupCompleted();
        onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted(optionalIAuthTabCallbackStub);
        lt34 lt34VarIAuthTabCallback = IAuthTabCallback(optionalIAuthTabCallbackStub);
        boolean z = true;
        int i = this.onExtraCallbackWithResult + 1;
        if (i <= 0) {
            i = 1;
        }
        if (!onnavigationeventOnWarmupCompleted.onExtraCallbackWithResult.isPresent()) {
            onWarmupCompleted onwarmupcompletedPostMessage = postMessage();
            str = onwarmupcompletedPostMessage.onWarmupCompleted;
            int i2 = onwarmupcompletedPostMessage.onNavigationEvent;
            optional = onwarmupcompletedPostMessage.onExtraCallbackWithResult;
            iMax = Math.max(i, i2);
        } else {
            iMax = (i + ((Integer) onnavigationeventOnWarmupCompleted.onExtraCallbackWithResult.get()).intValue()) - 1;
            onWarmupCompleted onwarmupcompletedIAuthTabCallback = IAuthTabCallback(iMax);
            str = onwarmupcompletedIAuthTabCallback.onWarmupCompleted;
            optional = onwarmupcompletedIAuthTabCallback.onExtraCallbackWithResult;
        }
        Optional<String> optionalEmpty = Optional.empty();
        if (this.asInterface.IAuthTabCallback() < iMax && this.onExtraCallbackWithResult != this.asInterface.IAuthTabCallback()) {
            throw new uh15("while scanning a block scalar", optionalIAuthTabCallbackStub, " the leading empty lines contain more spaces (" + iMax + ") than the first non-empty line.", this.asInterface.IAuthTabCallbackStub());
        }
        while (this.asInterface.IAuthTabCallback() == iMax && this.asInterface.asBinder() != 0) {
            sb.append(str);
            boolean z2 = " \t".indexOf(this.asInterface.asBinder()) == -1 ? z : false;
            int i3 = 0;
            while (sya61.IAuthTabCallbackDefault.onNavigationEvent(this.asInterface.onExtraCallbackWithResult(i3))) {
                i3++;
            }
            sb.append(this.asInterface.IAuthTabCallback(i3));
            Optional<String> engagementSignalsCallback = setEngagementSignalsCallback();
            onWarmupCompleted onwarmupcompletedIAuthTabCallback2 = IAuthTabCallback(iMax);
            String str2 = onwarmupcompletedIAuthTabCallback2.onWarmupCompleted;
            Optional optional3 = onwarmupcompletedIAuthTabCallback2.onExtraCallbackWithResult;
            if (this.asInterface.IAuthTabCallback() != iMax || this.asInterface.asBinder() == 0) {
                optionalEmpty = engagementSignalsCallback;
                optional2 = optional3;
                str = str2;
                break;
            }
            if (sya6Var == sya6.FOLDED && "\n".equals(engagementSignalsCallback.orElse(BuildConfig.FLAVOR)) && z2 && " \t".indexOf(this.asInterface.asBinder()) == -1) {
                if (str2.isEmpty()) {
                    sb.append(' ');
                }
            } else {
                sb.append(engagementSignalsCallback.orElse(BuildConfig.FLAVOR));
            }
            optionalEmpty = engagementSignalsCallback;
            optional = optional3;
            str = str2;
            z = true;
        }
        optional2 = optional;
        if (onnavigationeventOnWarmupCompleted.IAuthTabCallback == onNavigationEvent.EnumC0004onNavigationEvent.CLIP || onnavigationeventOnWarmupCompleted.IAuthTabCallback == onNavigationEvent.EnumC0004onNavigationEvent.KEEP) {
            sb.append(optionalEmpty.orElse(BuildConfig.FLAVOR));
        }
        if (onnavigationeventOnWarmupCompleted.IAuthTabCallback == onNavigationEvent.EnumC0004onNavigationEvent.KEEP) {
            sb.append(str);
        }
        return onExtraCallback(lt34VarIAuthTabCallback, new djycx2(sb.toString(), false, sya6Var, optionalIAuthTabCallbackStub, optional2));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[PHI: r0
      0x0054: PHI (r0v14 java.util.Optional) = (r0v0 java.util.Optional), (r0v21 java.util.Optional) binds: [B:7:0x001a, B:12:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private onNavigationEvent onWarmupCompleted(Optional<sya8> optional) throws NumberFormatException {
        Optional optionalEmpty = Optional.empty();
        int iAsBinder = this.asInterface.asBinder();
        if (iAsBinder == 45 || iAsBinder == 43) {
            this.asInterface.onWarmupCompleted();
            int iAsBinder2 = this.asInterface.asBinder();
            if (Character.isDigit(iAsBinder2)) {
                int i = Integer.parseInt(String.valueOf(Character.toChars(iAsBinder2)));
                if (i == 0) {
                    throw new uh15("while scanning a block scalar", optional, "expected indentation indicator in the range 1-9, but found 0", this.asInterface.IAuthTabCallbackStub());
                }
                optionalEmpty = Optional.of(Integer.valueOf(i));
                this.asInterface.onWarmupCompleted();
            }
        } else if (Character.isDigit(iAsBinder)) {
            int i2 = Integer.parseInt(String.valueOf(Character.toChars(iAsBinder)));
            if (i2 == 0) {
                throw new uh15("while scanning a block scalar", optional, "expected indentation indicator in the range 1-9, but found 0", this.asInterface.IAuthTabCallbackStub());
            }
            optionalEmpty = Optional.of(Integer.valueOf(i2));
            this.asInterface.onWarmupCompleted();
            iAsBinder = this.asInterface.asBinder();
            if (iAsBinder == 45 || iAsBinder == 43) {
                this.asInterface.onWarmupCompleted();
            }
        } else {
            iAsBinder = PKIFailureInfo.systemUnavail;
        }
        int iAsBinder3 = this.asInterface.asBinder();
        if (sya61.IAuthTabCallback.onNavigationEvent(iAsBinder3)) {
            throw new uh15("while scanning a block scalar", optional, "expected chomping or indentation indicators, but found " + String.valueOf(Character.toChars(iAsBinder3)) + "(" + iAsBinder3 + ")", this.asInterface.IAuthTabCallbackStub());
        }
        return new onNavigationEvent(iAsBinder, (Optional<Integer>) optionalEmpty);
    }

    private lt34 IAuthTabCallback(Optional<sya8> optional) {
        while (this.asInterface.asBinder() == 32) {
            this.asInterface.onWarmupCompleted();
        }
        lt34 lt34VarOnExtraCallbackWithResult = this.asInterface.asBinder() == 35 ? onExtraCallbackWithResult(sya17.IN_LINE) : null;
        int iAsBinder = this.asInterface.asBinder();
        if (setEngagementSignalsCallback().isPresent() || iAsBinder == 0) {
            return lt34VarOnExtraCallbackWithResult;
        }
        throw new uh15("while scanning a block scalar", optional, "expected a comment or a line break, but found " + String.valueOf(Character.toChars(iAsBinder)) + "(" + iAsBinder + ")", this.asInterface.IAuthTabCallbackStub());
    }

    private onWarmupCompleted postMessage() {
        StringBuilder sb = new StringBuilder();
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        int iIAuthTabCallback = 0;
        while (sya61.onWarmupCompleted.onNavigationEvent(this.asInterface.asBinder(), " \r")) {
            if (this.asInterface.asBinder() != 32) {
                sb.append(setEngagementSignalsCallback().orElse(BuildConfig.FLAVOR));
                optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
            } else {
                this.asInterface.onWarmupCompleted();
                if (this.asInterface.IAuthTabCallback() > iIAuthTabCallback) {
                    iIAuthTabCallback = this.asInterface.IAuthTabCallback();
                }
            }
        }
        return new onWarmupCompleted(sb.toString(), iIAuthTabCallback, optionalIAuthTabCallbackStub);
    }

    private onWarmupCompleted IAuthTabCallback(int i) {
        StringBuilder sb = new StringBuilder();
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        for (int iIAuthTabCallback = this.asInterface.IAuthTabCallback(); iIAuthTabCallback < i && this.asInterface.asBinder() == 32; iIAuthTabCallback++) {
            this.asInterface.onWarmupCompleted();
        }
        while (true) {
            Optional<String> engagementSignalsCallback = setEngagementSignalsCallback();
            if (engagementSignalsCallback.isPresent()) {
                sb.append(engagementSignalsCallback.get());
                optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
                for (int iIAuthTabCallback2 = this.asInterface.IAuthTabCallback(); iIAuthTabCallback2 < i && this.asInterface.asBinder() == 32; iIAuthTabCallback2++) {
                    this.asInterface.onWarmupCompleted();
                }
            } else {
                return new onWarmupCompleted(sb.toString(), -1, optionalIAuthTabCallbackStub);
            }
        }
    }

    private ycx41 onExtraCallback(sya6 sya6Var) {
        boolean z = sya6Var == sya6.DOUBLE_QUOTED;
        StringBuilder sb = new StringBuilder();
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        int iAsBinder = this.asInterface.asBinder();
        this.asInterface.onWarmupCompleted();
        onExtraCallback(z, optionalIAuthTabCallbackStub, sb);
        while (this.asInterface.asBinder() != iAsBinder) {
            IAuthTabCallback(optionalIAuthTabCallbackStub, sb);
            onExtraCallback(z, optionalIAuthTabCallbackStub, sb);
        }
        this.asInterface.onWarmupCompleted();
        return new djycx2(sb.toString(), false, sya6Var, optionalIAuthTabCallbackStub, this.asInterface.IAuthTabCallbackStub());
    }

    private void onExtraCallback(boolean z, Optional<sya8> optional, StringBuilder sb) {
        while (true) {
            int i = 0;
            while (sya61.onTransact.onWarmupCompleted(this.asInterface.onExtraCallbackWithResult(i), "'\"\\")) {
                i++;
            }
            if (i != 0) {
                sb.append(this.asInterface.IAuthTabCallback(i));
            }
            int iAsBinder = this.asInterface.asBinder();
            if (!z && iAsBinder == 39 && this.asInterface.onExtraCallbackWithResult(1) == 39) {
                sb.append('\'');
                this.asInterface.onNavigationEvent(2);
            } else if ((z && iAsBinder == 39) || (!z && "\"\\".indexOf(iAsBinder) != -1)) {
                sb.appendCodePoint(iAsBinder);
                this.asInterface.onWarmupCompleted();
            } else {
                if (!z || iAsBinder != 92) {
                    return;
                }
                this.asInterface.onWarmupCompleted();
                int iAsBinder2 = this.asInterface.asBinder();
                if (!Character.isSupplementaryCodePoint(iAsBinder2)) {
                    Map<Character, String> map = sya61.onExtraCallbackWithResult;
                    char c = (char) iAsBinder2;
                    if (map.containsKey(Character.valueOf(c))) {
                        sb.append(map.get(Character.valueOf(c)));
                        this.asInterface.onWarmupCompleted();
                    }
                }
                if (!Character.isSupplementaryCodePoint(iAsBinder2)) {
                    Map<Character, Integer> map2 = sya61.onExtraCallback;
                    char c2 = (char) iAsBinder2;
                    if (map2.containsKey(Character.valueOf(c2))) {
                        int iIntValue = map2.get(Character.valueOf(c2)).intValue();
                        this.asInterface.onWarmupCompleted();
                        String strOnExtraCallback = this.asInterface.onExtraCallback(iIntValue);
                        if (onNavigationEvent.matcher(strOnExtraCallback).find()) {
                            throw new uh15("while scanning a double-quoted scalar", optional, "expected escape sequence of " + iIntValue + " hexadecimal numbers, but found: " + strOnExtraCallback, this.asInterface.IAuthTabCallbackStub());
                        }
                        try {
                            sb.appendCodePoint(Integer.parseInt(strOnExtraCallback, 16));
                            this.asInterface.onNavigationEvent(iIntValue);
                        } catch (IllegalArgumentException unused) {
                            throw new uh15("while scanning a double-quoted scalar", optional, "found unknown escape character " + strOnExtraCallback, this.asInterface.IAuthTabCallbackStub());
                        }
                    }
                }
                if (setEngagementSignalsCallback().isPresent()) {
                    sb.append(onNavigationEvent(optional));
                } else {
                    throw new uh15("while scanning a double-quoted scalar", optional, "found unknown escape character " + String.valueOf(Character.toChars(iAsBinder2)) + "(" + iAsBinder2 + ")", this.asInterface.IAuthTabCallbackStub());
                }
            }
        }
    }

    private void IAuthTabCallback(Optional<sya8> optional, StringBuilder sb) {
        int i = 0;
        while (" \t".indexOf(this.asInterface.onExtraCallbackWithResult(i)) != -1) {
            i++;
        }
        String strIAuthTabCallback = this.asInterface.IAuthTabCallback(i);
        if (this.asInterface.asBinder() == 0) {
            throw new uh15("while scanning a quoted scalar", optional, "found unexpected end of stream", this.asInterface.IAuthTabCallbackStub());
        }
        Optional<String> engagementSignalsCallback = setEngagementSignalsCallback();
        if (engagementSignalsCallback.isPresent()) {
            String strOnNavigationEvent = onNavigationEvent(optional);
            if (!"\n".equals(engagementSignalsCallback.get())) {
                sb.append(engagementSignalsCallback.get());
            } else if (strOnNavigationEvent.isEmpty()) {
                sb.append(' ');
            }
            sb.append(strOnNavigationEvent);
            return;
        }
        sb.append(strIAuthTabCallback);
    }

    private String onNavigationEvent(Optional<sya8> optional) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String strOnExtraCallback = this.asInterface.onExtraCallback(3);
            if (("---".equals(strOnExtraCallback) || "...".equals(strOnExtraCallback)) && sya61.onTransact.onExtraCallbackWithResult(this.asInterface.onExtraCallbackWithResult(3))) {
                throw new uh15("while scanning a quoted scalar", optional, "found unexpected document separator", this.asInterface.IAuthTabCallbackStub());
            }
            while (" \t".indexOf(this.asInterface.asBinder()) != -1) {
                this.asInterface.onWarmupCompleted();
            }
            Optional<String> engagementSignalsCallback = setEngagementSignalsCallback();
            if (engagementSignalsCallback.isPresent()) {
                sb.append(engagementSignalsCallback.get());
            } else {
                return sb.toString();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ycx41 receiveFile() {
        StringBuilder sb = new StringBuilder();
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        int i = this.onExtraCallbackWithResult;
        Optional<sya8> optionalIAuthTabCallbackStub2 = optionalIAuthTabCallbackStub;
        String strPrefetchWithMultipleUrls = BuildConfig.FLAVOR;
        while (this.asInterface.asBinder() != 35) {
            int i2 = 0;
            while (true) {
                int iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(i2);
                sya61 sya61Var = sya61.onTransact;
                if (sya61Var.onExtraCallbackWithResult(iOnExtraCallbackWithResult)) {
                    break;
                }
                if (iOnExtraCallbackWithResult == 58) {
                    if (!sya61Var.onNavigationEvent(this.asInterface.onExtraCallbackWithResult(i2 + 1), mayLaunchUrl() ? ",[]{}" : BuildConfig.FLAVOR)) {
                        if (mayLaunchUrl() && ",[]{}".indexOf(iOnExtraCallbackWithResult) != -1) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
            if (i2 == 0) {
                break;
            }
            this.IAuthTabCallback = false;
            sb.append(strPrefetchWithMultipleUrls);
            sb.append(this.asInterface.IAuthTabCallback(i2));
            optionalIAuthTabCallbackStub2 = this.asInterface.IAuthTabCallbackStub();
            strPrefetchWithMultipleUrls = prefetchWithMultipleUrls();
            if (strPrefetchWithMultipleUrls.isEmpty() || this.asInterface.asBinder() == 35 || (extraCommand() && this.asInterface.IAuthTabCallback() < i + 1)) {
                break;
            }
        }
        return new djycx2(sb.toString(), true, optionalIAuthTabCallbackStub, optionalIAuthTabCallbackStub2);
    }

    private boolean onWarmupCompleted() {
        int iIAuthTabCallback = this.asInterface.IAuthTabCallback();
        int i = 0;
        while (true) {
            int iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(i);
            if (iOnExtraCallbackWithResult == 0 || !sya61.onTransact.onExtraCallbackWithResult(iOnExtraCallbackWithResult)) {
                break;
            }
            iIAuthTabCallback = (sya61.onWarmupCompleted.onExtraCallbackWithResult(iOnExtraCallbackWithResult) || (iOnExtraCallbackWithResult == 13 && this.asInterface.onExtraCallbackWithResult(i + 2) == 10) || iOnExtraCallbackWithResult == 65279) ? 0 : iIAuthTabCallback + 1;
            i++;
        }
        if (this.asInterface.onExtraCallbackWithResult(i) == 35 || this.asInterface.onExtraCallbackWithResult(i + 1) == 0 || (extraCommand() && iIAuthTabCallback < this.onExtraCallbackWithResult)) {
            return true;
        }
        if (extraCommand()) {
            int i2 = 1;
            while (true) {
                int i3 = i + i2;
                int iOnExtraCallbackWithResult2 = this.asInterface.onExtraCallbackWithResult(i3);
                if (iOnExtraCallbackWithResult2 == 0) {
                    break;
                }
                sya61 sya61Var = sya61.onTransact;
                if (sya61Var.onExtraCallbackWithResult(iOnExtraCallbackWithResult2)) {
                    break;
                }
                if (iOnExtraCallbackWithResult2 == 58 && sya61Var.onExtraCallbackWithResult(this.asInterface.onExtraCallbackWithResult(i3 + 1))) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    private String prefetchWithMultipleUrls() {
        int i = 0;
        while (true) {
            if (this.asInterface.onExtraCallbackWithResult(i) != 32 && this.asInterface.onExtraCallbackWithResult(i) != 9) {
                break;
            }
            i++;
        }
        String strIAuthTabCallback = this.asInterface.IAuthTabCallback(i);
        Optional<String> engagementSignalsCallback = setEngagementSignalsCallback();
        if (!engagementSignalsCallback.isPresent()) {
            return strIAuthTabCallback;
        }
        this.IAuthTabCallback = true;
        String strOnExtraCallback = this.asInterface.onExtraCallback(3);
        if ("---".equals(strOnExtraCallback) || ("...".equals(strOnExtraCallback) && sya61.onTransact.onExtraCallbackWithResult(this.asInterface.onExtraCallbackWithResult(3)))) {
            return BuildConfig.FLAVOR;
        }
        if (this.IAuthTabCallbackDefault.IAuthTabCallback_Parcel() && onWarmupCompleted()) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (this.asInterface.asBinder() == 32) {
                this.asInterface.onWarmupCompleted();
            } else {
                Optional<String> engagementSignalsCallback2 = setEngagementSignalsCallback();
                if (engagementSignalsCallback2.isPresent()) {
                    sb.append(engagementSignalsCallback2.get());
                    String strOnExtraCallback2 = this.asInterface.onExtraCallback(3);
                    if ("---".equals(strOnExtraCallback2) || ("...".equals(strOnExtraCallback2) && sya61.onTransact.onExtraCallbackWithResult(this.asInterface.onExtraCallbackWithResult(3)))) {
                        break;
                    }
                } else {
                    if (!"\n".equals(engagementSignalsCallback.orElse(BuildConfig.FLAVOR))) {
                        return engagementSignalsCallback.orElse(BuildConfig.FLAVOR) + ((Object) sb);
                    }
                    if (sb.length() == 0) {
                        return " ";
                    }
                    return sb.toString();
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    private String onWarmupCompleted(String str, Optional<sya8> optional) {
        int iAsBinder = this.asInterface.asBinder();
        if (iAsBinder != 33) {
            throw new uh15("while scanning a " + str, optional, "expected '!', but found " + String.valueOf(Character.toChars(iAsBinder)) + "(" + iAsBinder + ")", this.asInterface.IAuthTabCallbackStub());
        }
        int i = 1;
        int iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(1);
        if (iOnExtraCallbackWithResult != 32) {
            int i2 = 1;
            while (sya61.onNavigationEvent.onExtraCallbackWithResult(iOnExtraCallbackWithResult)) {
                i2++;
                iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(i2);
            }
            if (iOnExtraCallbackWithResult != 33) {
                this.asInterface.onNavigationEvent(i2);
                throw new uh15("while scanning a " + str, optional, "expected '!', but found " + String.valueOf(Character.toChars(iOnExtraCallbackWithResult)) + "(" + iOnExtraCallbackWithResult + ")", this.asInterface.IAuthTabCallbackStub());
            }
            i = 1 + i2;
        }
        return this.asInterface.IAuthTabCallback(i);
    }

    private String onExtraCallbackWithResult(String str, sya61 sya61Var, Optional<sya8> optional) {
        StringBuilder sb = new StringBuilder();
        int iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(0);
        int i = 0;
        while (sya61Var.onExtraCallbackWithResult(iOnExtraCallbackWithResult)) {
            if (iOnExtraCallbackWithResult == 37) {
                sb.append(this.asInterface.IAuthTabCallback(i));
                sb.append(onExtraCallback(str, optional));
                i = 0;
            } else {
                i++;
            }
            iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(i);
        }
        if (i != 0) {
            sb.append(this.asInterface.IAuthTabCallback(i));
        }
        if (sb.length() == 0) {
            throw new uh15("while scanning a " + str, optional, "expected URI, but found " + String.valueOf(Character.toChars(iOnExtraCallbackWithResult)) + "(" + iOnExtraCallbackWithResult + ")", this.asInterface.IAuthTabCallbackStub());
        }
        return sb.toString();
    }

    private String onExtraCallback(String str, Optional<sya8> optional) {
        int i = 1;
        while (this.asInterface.onExtraCallbackWithResult(i * 3) == 37) {
            i++;
        }
        Optional<sya8> optionalIAuthTabCallbackStub = this.asInterface.IAuthTabCallbackStub();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        while (this.asInterface.asBinder() == 37) {
            this.asInterface.onWarmupCompleted();
            try {
                byteBufferAllocate.put((byte) Integer.parseInt(this.asInterface.onExtraCallback(2), 16));
                this.asInterface.onNavigationEvent(2);
            } catch (NumberFormatException unused) {
                int iAsBinder = this.asInterface.asBinder();
                String strValueOf = String.valueOf(Character.toChars(iAsBinder));
                int iOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult(1);
                throw new uh15("while scanning a " + str, optional, "expected URI escape sequence of 2 hexadecimal numbers, but found " + strValueOf + "(" + iAsBinder + ") and " + String.valueOf(Character.toChars(iOnExtraCallbackWithResult)) + "(" + iOnExtraCallbackWithResult + ")", this.asInterface.IAuthTabCallbackStub());
            }
        }
        try {
            return getPaint.IAuthTabCallback(byteBufferAllocate);
        } catch (CharacterCodingException e) {
            throw new uh15("while scanning a " + str, optional, "expected URI in UTF-8: " + e.getMessage(), optionalIAuthTabCallbackStub);
        }
    }

    private Optional<String> setEngagementSignalsCallback() {
        int iAsBinder = this.asInterface.asBinder();
        if (iAsBinder == 13 || iAsBinder == 10 || iAsBinder == 133) {
            if (iAsBinder == 13 && 10 == this.asInterface.onExtraCallbackWithResult(1)) {
                this.asInterface.onNavigationEvent(2);
            } else {
                this.asInterface.onWarmupCompleted();
            }
            return Optional.of("\n");
        }
        return Optional.empty();
    }

    private List<ycx41> onExtraCallback(ycx41... ycx41VarArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ycx41VarArr.length; i++) {
            if (ycx41VarArr[i] != null && (this.IAuthTabCallbackDefault.IAuthTabCallback_Parcel() || !(ycx41VarArr[i] instanceof lt34))) {
                arrayList.add(ycx41VarArr[i]);
            }
        }
        return arrayList;
    }

    public void onNavigationEvent() {
        this.asInterface.asInterface();
    }

    static class onNavigationEvent {
        private final EnumC0004onNavigationEvent IAuthTabCallback;
        private final Optional<Integer> onExtraCallbackWithResult;

        /* renamed from: o.uh8$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        enum EnumC0004onNavigationEvent {
            STRIP,
            CLIP,
            KEEP
        }

        public onNavigationEvent(EnumC0004onNavigationEvent enumC0004onNavigationEvent, Optional<Integer> optional) {
            this.IAuthTabCallback = enumC0004onNavigationEvent;
            this.onExtraCallbackWithResult = optional;
        }

        public onNavigationEvent(int i, Optional<Integer> optional) {
            this(onExtraCallbackWithResult(i), optional);
        }

        private static EnumC0004onNavigationEvent onExtraCallbackWithResult(int i) {
            if (i == 43) {
                return EnumC0004onNavigationEvent.KEEP;
            }
            if (i == 45) {
                return EnumC0004onNavigationEvent.STRIP;
            }
            if (i == Integer.MIN_VALUE) {
                return EnumC0004onNavigationEvent.CLIP;
            }
            throw new IllegalArgumentException("Unexpected block chomping indicator: " + i);
        }
    }

    static class onWarmupCompleted {
        private final Optional<sya8> onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final String onWarmupCompleted;

        public onWarmupCompleted(String str, int i, Optional<sya8> optional) {
            this.onWarmupCompleted = str;
            this.onNavigationEvent = i;
            this.onExtraCallbackWithResult = optional;
        }
    }
}
