package o;

import im.toss.features.privacysyncterms.model.UpdateAddressInfo;
import im.toss.features.privacysyncterms.model.UpdateJobInfo;
import im.toss.features.privacysyncterms.model.UpdateProfileInfo;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.featurescommon.profile.library.model.Address;
import im.toss.featurescommon.profile.library.model.Company;
import im.toss.featurescommon.profile.library.model.IndustrialClassification;
import im.toss.featurescommon.profile.library.model.Job;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ProducerSequenceFactoryExternalSyntheticLambda9 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    private static final UpdateAddressInfo onNavigationEvent(Address address) {
        int i = 2 % 2;
        UpdateAddressInfo updateAddressInfo = new UpdateAddressInfo(address.onWarmupCompleted(), address.IAuthTabCallback(), address.onExtraCallbackWithResult(), address.onNavigationEvent());
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return updateAddressInfo;
    }

    private static final UpdateJobInfo onWarmupCompleted(Company company) {
        String strOnExtraCallbackWithResult;
        IndustrialClassification industrialClassificationAsInterface;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Job interfaceDescriptor = company.getInterfaceDescriptor();
            if (Intrinsics.areEqual(interfaceDescriptor != null ? interfaceDescriptor.onExtraCallback() : null, "101") || (industrialClassificationAsInterface = company.asInterface()) == null) {
                strOnExtraCallbackWithResult = null;
            } else {
                int i3 = onExtraCallback + 67;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                strOnExtraCallbackWithResult = industrialClassificationAsInterface.onExtraCallbackWithResult();
            }
            Job interfaceDescriptor2 = company.getInterfaceDescriptor();
            return new UpdateJobInfo(interfaceDescriptor2 != null ? interfaceDescriptor2.onExtraCallback() : null, strOnExtraCallbackWithResult, company.access000());
        }
        company.getInterfaceDescriptor();
        throw null;
    }

    private static final boolean IAuthTabCallback(Company company) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Job interfaceDescriptor = company.getInterfaceDescriptor();
        if (interfaceDescriptor == null) {
            return false;
        }
        int i4 = onWarmupCompleted + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        boolean zBooleanValue = ((Boolean) Job.onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{interfaceDescriptor}, iOnExtraCallback2, 628040516, -628040516, iOnExtraCallback)).booleanValue();
        int i6 = onExtraCallback + 9;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return zBooleanValue;
    }

    public static final UpdateProfileInfo onNavigationEvent(long j, @Nullable Address address, @Nullable Company company, @Nullable String str) {
        UpdateAddressInfo updateAddressInfo;
        String str2;
        UpdateJobInfo updateJobInfo;
        String strAccess100;
        Address addressOnExtraCallback;
        UpdateJobInfo updateJobInfoOnWarmupCompleted;
        UpdateAddressInfo updateAddressInfoOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 67;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        UpdateAddressInfo updateAddressInfoOnNavigationEvent2 = null;
        if (address != null) {
            int i6 = i4 + 87;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                updateAddressInfoOnNavigationEvent = onNavigationEvent(address);
                int i7 = 90 / 0;
            } else {
                updateAddressInfoOnNavigationEvent = onNavigationEvent(address);
            }
            updateAddressInfo = updateAddressInfoOnNavigationEvent;
        } else {
            int i8 = i2 + 81;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            updateAddressInfo = null;
        }
        if (str == null || !(!StringsKt.isBlank(str))) {
            int i10 = onWarmupCompleted + 15;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            str2 = null;
        } else {
            str2 = str;
        }
        if (company != null) {
            int i12 = onWarmupCompleted + 107;
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                updateJobInfoOnWarmupCompleted = onWarmupCompleted(company);
                int i13 = 8 / 0;
            } else {
                updateJobInfoOnWarmupCompleted = onWarmupCompleted(company);
            }
            updateJobInfo = updateJobInfoOnWarmupCompleted;
        } else {
            updateJobInfo = null;
        }
        if (company == null || !IAuthTabCallback(company)) {
            strAccess100 = null;
        } else {
            int i14 = onExtraCallback + 7;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            strAccess100 = company.access100();
        }
        if (company != null && IAuthTabCallback(company) && (addressOnExtraCallback = company.onExtraCallback()) != null) {
            int i16 = onExtraCallback + 3;
            onWarmupCompleted = i16 % 128;
            if (i16 % 2 == 0) {
                updateAddressInfoOnNavigationEvent2 = onNavigationEvent(addressOnExtraCallback);
                int i17 = 63 / 0;
            } else {
                updateAddressInfoOnNavigationEvent2 = onNavigationEvent(addressOnExtraCallback);
            }
        }
        return new UpdateProfileInfo(j, updateAddressInfo, str2, updateJobInfo, strAccess100, updateAddressInfoOnNavigationEvent2);
    }
}
