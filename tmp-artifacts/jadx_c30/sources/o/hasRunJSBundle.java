package o;

import com.google.gson.annotations.SerializedName;
import net.sf.scuba.smartcards.BuildConfig;
import viva.republica.toss.network.model.verify.VerifyBaseInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class hasRunJSBundle extends VerifyBaseInfo {

    @SerializedName("userName")
    private String userName = BuildConfig.FLAVOR;

    @SerializedName("birthday8")
    private String birthday8 = BuildConfig.FLAVOR;

    @SerializedName("gender")
    private NestmjniCallJSFunction gender = NestmjniCallJSFunction.MALE;

    @SerializedName("nationality")
    private NestmdecrementPendingJSCalls nationality = NestmdecrementPendingJSCalls.LOCAL;
}
