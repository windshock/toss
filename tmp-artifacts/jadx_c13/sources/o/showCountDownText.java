package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.IDN;
import java.util.Arrays;
import java.util.Locale;
import okhttp3.internal.url._UrlKt;
import org.apache.commons.validator.routines.RegexValidator;
import org.opencv.imgproc.Imgproc;
import ua.naiksoftware.stomp.dto.StompHeader;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class showCountDownText implements Serializable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String[] IAuthTabCallback;
    private static String[] IAuthTabCallbackDefault = null;
    private static String[] IAuthTabCallbackStub = null;
    private static char[] IAuthTabCallbackStubProxy = null;
    private static String[] IAuthTabCallback_Parcel = null;
    private static int ICustomTabsCallback = 0;
    private static int access000 = 0;
    private static String[] access100 = null;
    private static boolean asBinder = false;
    private static String[] asInterface = null;
    private static int extraCallback = 1;
    private static int getInterfaceDescriptor = 1;
    private static final String[] onExtraCallback;
    private static final String[] onExtraCallbackWithResult;
    private static final String[] onNavigationEvent;
    private static String[] onTransact = null;
    private static final String[] onWarmupCompleted;
    private static final long serialVersionUID = -4407125112880174009L;
    private final boolean allowLocal;
    private final RegexValidator domainRegex;
    private final RegexValidator hostnameRegex;
    final String[] mycountryCodeTLDsMinus;
    final String[] mycountryCodeTLDsPlus;
    final String[] mygenericTLDsMinus;
    final String[] mygenericTLDsPlus;
    final String[] mylocalTLDsMinus;
    final String[] mylocalTLDsPlus;

    public enum onExtraCallback {
        GENERIC_PLUS,
        GENERIC_MINUS,
        COUNTRY_CODE_PLUS,
        COUNTRY_CODE_MINUS,
        GENERIC_RO,
        COUNTRY_CODE_RO,
        INFRASTRUCTURE_RO,
        LOCAL_RO,
        LOCAL_PLUS,
        LOCAL_MINUS
    }

    /* synthetic */ showCountDownText(boolean z, AnonymousClass1 anonymousClass1) {
        this(z);
    }

    static {
        onExtraCallback();
        String[] strArr = new String[0];
        onWarmupCompleted = strArr;
        IAuthTabCallback = new String[]{"arpa"};
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 0, 0}, true, new byte[]{0, 0, 1}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{3, 4, 0, 1}, true, new byte[]{0, 1, 1, 1}, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new int[]{7, 4, 0, 1}, true, new byte[]{0, 1, 0, 0}, objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{11, 4, 0, 0}, true, new byte[]{1, 0, 0, 1}, objArr4);
        String strIntern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new int[]{15, 4, 168, 0}, false, new byte[]{0, 0, 1, 0}, objArr5);
        String strIntern5 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new int[]{19, 3, 186, 2}, true, new byte[]{1, 0, 1}, objArr6);
        String strIntern6 = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a(new int[]{22, 7, 100, 2}, false, new byte[]{1, 0, 0, 1, 1, 1, 1}, objArr7);
        String strIntern7 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(new int[]{29, 5, 115, 2}, false, new byte[]{1, 1, 0, 1, 1}, objArr8);
        onExtraCallbackWithResult = new String[]{"aaa", "aarp", "abarth", "abb", "abbott", "abbvie", "abc", "able", "abogado", "abudhabi", "academy", "accenture", "accountant", "accountants", "aco", "actor", "adac", "ads", "adult", "aeg", "aero", "aetna", "afamilycompany", "afl", "africa", "agakhan", "agency", "aig", "airbus", "airforce", "airtel", "akdn", "alfaromeo", "alibaba", "alipay", "allfinanz", "allstate", "ally", "alsace", "alstom", "amazon", "americanexpress", "americanfamily", "amex", "amfam", "amica", "amsterdam", "analytics", "android", "anquan", "anz", "aol", "apartments", strIntern, "apple", "aquarelle", "arab", "aramco", "archi", "army", "art", "arte", "asda", "asia", "associates", "athleta", "attorney", "auction", "audi", "audible", "audio", "auspost", "author", "auto", "autos", "avianca", "aws", "axa", "azure", "baby", "baidu", "banamex", "bananarepublic", "band", "bank", "bar", "barcelona", "barclaycard", "barclays", "barefoot", "bargains", "baseball", "basketball", "bauhaus", "bayern", "bbc", "bbt", "bbva", "bcg", "bcn", "beats", "beauty", "beer", "bentley", "berlin", "best", "bestbuy", "bet", "bharti", "bible", "bid", "bike", "bing", "bingo", "bio", "biz", "black", "blackfriday", "blockbuster", "blog", "bloomberg", "blue", "bms", "bmw", "bnpparibas", "boats", "boehringer", "bofa", "bom", "bond", "boo", "book", "booking", "bosch", "bostik", "boston", "bot", "boutique", "box", "bradesco", "bridgestone", "broadway", "broker", "brother", "brussels", "budapest", "bugatti", "build", "builders", "business", "buy", "buzz", "bzh", "cab", "cafe", "cal", "call", "calvinklein", "cam", "camera", "camp", "cancerresearch", "canon", "capetown", "capital", "capitalone", "car", "caravan", "cards", "care", "career", "careers", "cars", "casa", "case", "caseih", "cash", "casino", "cat", "catering", "catholic", "cba", "cbn", "cbre", "cbs", "ceb", "center", "ceo", "cern", "cfa", "cfd", "chanel", "channel", "charity", "chase", "chat", "cheap", "chintai", "christmas", "chrome", "church", "cipriani", "circle", "cisco", "citadel", "citi", "citic", "city", "cityeats", "claims", "cleaning", "click", "clinic", "clinique", "clothing", "cloud", "club", "clubmed", "coach", "codes", "coffee", "college", "cologne", "com", "comcast", "commbank", "community", "company", "compare", "computer", "comsec", "condos", "construction", "consulting", "contact", "contractors", "cooking", "cookingchannel", "cool", "coop", "corsica", "country", "coupon", "coupons", "courses", "cpa", "credit", "creditcard", "creditunion", "cricket", "crown", "crs", "cruise", "cruises", "csc", "cuisinella", "cymru", "cyou", "dabur", "dad", "dance", strIntern2, "date", "dating", "datsun", "day", "dclk", "dds", "deal", "dealer", "deals", "degree", "delivery", "dell", "deloitte", "delta", "democrat", "dental", "dentist", "desi", "design", "dev", "dhl", "diamonds", "diet", "digital", "direct", "directory", "discount", "discover", "dish", "diy", "dnp", "docs", "doctor", "dog", "domains", "dot", "download", "drive", "dtv", "dubai", "duck", "dunlop", "dupont", "durban", "dvag", "dvr", "earth", "eat", "eco", "edeka", "edu", "education", "email", "emerck", "energy", "engineer", "engineering", "enterprises", "epson", "equipment", "ericsson", "erni", "esq", "estate", "etisalat", "eurovision", "eus", "events", "exchange", "expert", "exposed", "express", "extraspace", "fage", "fail", "fairwinds", "faith", "family", "fan", "fans", "farm", "farmers", "fashion", "fast", "fedex", "feedback", "ferrari", "ferrero", "fiat", "fidelity", "fido", "film", "final", "finance", "financial", "fire", "firestone", "firmdale", "fish", "fishing", "fit", "fitness", "flickr", "flights", "flir", "florist", "flowers", "fly", "foo", "food", "foodnetwork", "football", "ford", "forex", "forsale", "forum", "foundation", "fox", "free", "fresenius", "frl", "frogans", "frontdoor", "frontier", "ftr", "fujitsu", "fujixerox", "fun", "fund", "furniture", "futbol", "fyi", "gal", "gallery", "gallo", "gallup", "game", "games", "gap", "garden", "gay", "gbiz", "gdn", "gea", "gent", "genting", "george", "ggee", "gift", "gifts", "gives", "giving", "glade", "glass", "gle", "global", "globo", "gmail", "gmbh", "gmo", "gmx", "godaddy", "gold", "goldpoint", "golf", "goo", "goodyear", "goog", "google", "gop", "got", "gov", "grainger", "graphics", "gratis", "green", "gripe", "grocery", "group", "guardian", "gucci", "guge", "guide", "guitars", "guru", "hair", "hamburg", "hangout", "haus", "hbo", "hdfc", "hdfcbank", "health", "healthcare", "help", "helsinki", "here", "hermes", "hgtv", "hiphop", "hisamitsu", "hitachi", "hiv", "hkt", "hockey", "holdings", "holiday", "homedepot", "homegoods", "homes", "homesense", "honda", "horse", "hospital", "host", "hosting", "hot", "hoteles", "hotels", "hotmail", "house", "how", "hsbc", "hughes", "hyatt", "hyundai", "ibm", "icbc", "ice", "icu", "ieee", "ifm", "ikano", "imamat", "imdb", "immo", "immobilien", "inc", "industries", "infiniti", "info", "ing", "ink", "institute", "insurance", "insure", "int", "intel", "international", "intuit", "investments", "ipiranga", "irish", "ismaili", "ist", "istanbul", "itau", "itv", "iveco", "jaguar", "java", "jcb", "jcp", "jeep", "jetzt", "jewelry", "jio", "jll", "jmp", "jnj", "jobs", "joburg", "jot", "joy", "jpmorgan", "jprs", "juegos", "juniper", "kaufen", "kddi", "kerryhotels", "kerrylogistics", "kerryproperties", "kfh", "kia", "kim", "kinder", "kindle", "kitchen", "kiwi", "koeln", "komatsu", "kosher", "kpmg", "kpn", "krd", "kred", "kuokgroup", "kyoto", "lacaixa", "lamborghini", "lamer", "lancaster", "lancia", "land", "landrover", "lanxess", "lasalle", "lat", "latino", "latrobe", "law", "lawyer", "lds", "lease", "leclerc", "lefrak", "legal", "lego", "lexus", "lgbt", "lidl", "life", "lifeinsurance", "lifestyle", "lighting", "like", "lilly", "limited", "limo", "lincoln", "linde", "link", "lipsy", "live", "living", "lixil", "llc", "llp", "loan", "loans", "locker", "locus", "loft", "lol", "london", "lotte", "lotto", "love", "lpl", "lplfinancial", "ltd", "ltda", "lundbeck", "lupin", "luxe", "luxury", "macys", "madrid", "maif", "maison", "makeup", "man", "management", "mango", "map", "market", "marketing", "markets", "marriott", "marshalls", "maserati", "mattel", "mba", "mckinsey", "med", "media", "meet", "melbourne", "meme", "memorial", "men", "menu", "merckmsd", "metlife", "miami", "microsoft", "mil", "mini", "mint", "mit", "mitsubishi", "mlb", "mls", "mma", "mobi", "mobile", "moda", "moe", "moi", "mom", "monash", "money", "monster", "mormon", "mortgage", "moscow", "moto", "motorcycles", "mov", "movie", "msd", "mtn", "mtr", "museum", "mutual", "nab", "nagoya", strIntern3, "nationwide", "natura", "navy", "nba", "nec", "net", "netbank", "netflix", "network", "neustar", "new", "newholland", "news", "next", "nextdirect", "nexus", "nfl", "ngo", "nhk", "nico", "nike", "nikon", "ninja", "nissan", "nissay", "nokia", "northwesternmutual", "norton", "now", "nowruz", "nowtv", "nra", "nrw", "ntt", "nyc", "obi", "observer", "off", "office", "okinawa", "olayan", "olayangroup", "oldnavy", "ollo", "omega", "one", "ong", "onl", "online", "onyourside", "ooo", "open", "oracle", "orange", "org", "organic", "origins", "osaka", "otsuka", "ott", "ovh", strIntern4, "panasonic", "paris", "pars", "partners", "parts", "party", "passagens", "pay", "pccw", "pet", "pfizer", "pharmacy", "phd", "philips", "phone", "photo", "photography", "photos", "physio", "pics", "pictet", "pictures", "pid", "pin", "ping", "pink", "pioneer", "pizza", "place", strIntern5, "playstation", "plumbing", "plus", "pnc", "pohl", "poker", "politie", "porn", "post", "pramerica", "praxi", "press", "prime", "pro", "prod", "productions", "prof", "progressive", "promo", "properties", "property", "protection", "pru", "prudential", "pub", "pwc", "qpon", "quebec", "quest", "qvc", "racing", "radio", "raid", "read", "realestate", "realtor", "realty", "recipes", "red", "redstone", "redumbrella", "rehab", "reise", "reisen", "reit", "reliance", "ren", "rent", "rentals", "repair", "report", "republican", "rest", "restaurant", "review", "reviews", "rexroth", "rich", "richardli", "ricoh", "ril", "rio", "rip", "rmit", "rocher", "rocks", "rodeo", "rogers", "room", "rsvp", "rugby", "ruhr", "run", "rwe", "ryukyu", "saarland", "safe", "safety", "sakura", "sale", "salon", "samsclub", "samsung", "sandvik", "sandvikcoromant", "sanofi", "sap", "sarl", "sas", "save", "saxo", "sbi", "sbs", "sca", "scb", "schaeffler", "schmidt", "scholarships", "school", "schule", "schwarz", "science", "scjohnson", "scot", "search", "seat", "secure", "security", "seek", "select", "sener", "services", "ses", "seven", "sew", strIntern6, "sexy", "sfr", "shangrila", "sharp", "shaw", "shell", "shia", "shiksha", "shoes", "shop", "shopping", "shouji", "show", "showtime", "shriram", "silk", "sina", "singles", "site", "ski", "skin", "sky", "skype", "sling", "smart", "smile", "sncf", "soccer", "social", "softbank", "software", "sohu", "solar", "solutions", "song", "sony", "soy", "space", "sport", "spot", "spreadbetting", "srl", "stada", "staples", "star", "statebank", "statefarm", "stc", "stcgroup", "stockholm", strIntern7, "store", "stream", "studio", "study", ((String) objArr8[0]).intern(), "sucks", "supplies", "supply", "support", "surf", "surgery", "suzuki", "swatch", "swiftcover", "swiss", "sydney", "systems", "tab", "taipei", "talk", "taobao", "target", "tatamotors", "tatar", "tattoo", "tax", "taxi", "tci", "tdk", "team", "tech", "technology", "tel", "temasek", "tennis", "teva", "thd", "theater", "theatre", "tiaa", "tickets", "tienda", "tiffany", "tips", "tires", "tirol", "tjmaxx", "tjx", "tkmaxx", "tmall", "today", "tokyo", "tools", "top", "toray", "toshiba", "total", "tours", "town", "toyota", 
        "toys", "trade", "trading", "training", "travel", "travelchannel", "travelers", "travelersinsurance", "trust", "trv", "tube", "tui", "tunes", "tushu", "tvs", "ubank", "ubs", "unicom", "university", "uno", "uol", "ups", "vacations", "vana", "vanguard", "vegas", "ventures", "verisign", "versicherung", "vet", "viajes", "video", "vig", "viking", "villas", "vin", "vip", "virgin", "visa", "vision", "viva", "vivo", "vlaanderen", "vodka", "volkswagen", "volvo", "vote", "voting", "voto", "voyage", "vuelos", "wales", "walmart", "walter", "wang", "wanggou", "watch", "watches", "weather", "weatherchannel", "webcam", "weber", "website", "wed", "wedding", "weibo", "weir", "whoswho", "wien", "wiki", "williamhill", "win", "windows", "wine", "winners", "wme", "wolterskluwer", "woodside", "work", "works", "world", "wow", "wtc", "wtf", "xbox", "xerox", "xfinity", "xihuan", "xin", "xn--11b4c3d", "xn--1ck2e1b", "xn--1qqw23a", "xn--30rr7y", "xn--3bst00m", "xn--3ds443g", "xn--3oq18vl8pn36a", "xn--3pxu8k", "xn--42c2d9a", "xn--45q11c", "xn--4gbrim", "xn--55qw42g", "xn--55qx5d", "xn--5su34j936bgsg", "xn--5tzm5g", "xn--6frz82g", "xn--6qq986b3xl", "xn--80adxhks", "xn--80aqecdr1a", "xn--80asehdb", "xn--80aswg", "xn--8y0a063a", "xn--90ae", "xn--9dbq2a", "xn--9et52u", "xn--9krt00a", "xn--b4w605ferd", "xn--bck1b9a5dre4c", "xn--c1avg", "xn--c2br7g", "xn--cck2b3b", "xn--cckwcxetd", "xn--cg4bki", "xn--czr694b", "xn--czrs0t", "xn--czru2d", "xn--d1acj3b", "xn--eckvdtc9d", "xn--efvy88h", "xn--fct429k", "xn--fhbei", "xn--fiq228c5hs", "xn--fiq64b", "xn--fjq720a", "xn--flw351e", "xn--fzys8d69uvgm", "xn--g2xx48c", "xn--gckr3f0f", "xn--gk3at1e", "xn--hxt814e", "xn--i1b6b1a6a2e", "xn--imr513n", "xn--io0a7i", "xn--j1aef", "xn--jlq480n2rg", "xn--jlq61u9w7b", "xn--jvr189m", "xn--kcrx77d1x4a", "xn--kput3i", "xn--mgba3a3ejt", "xn--mgba7c0bbn0a", "xn--mgbaakc7dvf", "xn--mgbab2bd", "xn--mgbca7dzdo", "xn--mgbi4ecexp", "xn--mgbt3dhd", "xn--mk1bu44c", "xn--mxtq1m", "xn--ngbc5azd", "xn--ngbe9e0a", "xn--ngbrx", "xn--nqv7f", "xn--nqv7fs00ema", "xn--nyqy26a", "xn--otu796d", "xn--p1acf", "xn--pssy2u", "xn--q9jyb4c", "xn--qcka1pmc", "xn--rhqv96g", "xn--rovu88b", "xn--ses554g", "xn--t60b56a", "xn--tckwe", "xn--tiq49xqyj", "xn--unup4y", "xn--vermgensberater-ctb", "xn--vermgensberatung-pwb", "xn--vhquv", "xn--vuq861b", "xn--w4r85el8fhu5dnra", "xn--w4rs40l", "xn--xhq521b", "xn--zfr164b", "xxx", "xyz", "yachts", "yahoo", "yamaxun", "yandex", "yodobashi", "yoga", "yokohama", "you", "youtube", "yun", "zappos", "zara", "zero", "zip", "zone", "zuerich"};
        onNavigationEvent = new String[]{"ac", "ad", "ae", "af", "ag", "ai", "al", "am", "ao", "aq", "ar", "as", "at", "au", "aw", "ax", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bm", "bn", "bo", "br", "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cd", "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn", "co", "cr", "cu", "cv", "cw", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "er", "es", "et", "eu", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gg", "gh", "gi", "gl", "gm", "gn", "gp", "gq", "gr", "gs", "gt", "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu", StompHeader.ID, "ie", "il", "im", "in", "io", "iq", "ir", "is", "it", "je", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn", "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", "me", "mg", "mh", "mk", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mu", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nu", "nz", "om", "pa", "pe", "pf", "pg", "ph", "pk", "pl", "pm", "pn", "pr", "ps", "pt", "pw", "py", "qa", "re", "ro", "rs", "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", "so", "sr", "ss", "st", "su", "sv", "sx", "sy", "sz", "tc", "td", "tf", "tg", "th", "tj", "tk", "tl", "tm", "tn", "to", "tr", "tt", "tv", "tw", "tz", "ua", "ug", "uk", "us", "uy", "uz", "va", "vc", "ve", "vg", "vi", "vn", "vu", "wf", "ws", "xn--2scrj9c", "xn--3e0b707e", "xn--3hcrj9c", "xn--45br5cyl", "xn--45brj9c", "xn--54b7fta0cc", "xn--80ao21a", "xn--90a3ac", "xn--90ais", "xn--clchc0ea0b2g2a9gcd", "xn--d1alf", "xn--e1a4c", "xn--fiqs8s", "xn--fiqz9s", "xn--fpcrj9c3d", "xn--fzc2c9e2c", "xn--gecrj9c", "xn--h2breg3eve", "xn--h2brj9c", "xn--h2brj9c8c", "xn--j1amh", "xn--j6w193g", "xn--kprw13d", "xn--kpry57d", "xn--l1acc", "xn--lgbbat1ad8j", "xn--mgb9awbf", "xn--mgba3a4f16a", "xn--mgbaam7a8h", "xn--mgbah1a3hjkrd", "xn--mgbai9azgqp6j", "xn--mgbayh7gpa", "xn--mgbbh1a", "xn--mgbbh1a71e", "xn--mgbc0a9azcg", "xn--mgbcpq6gpa1a", "xn--mgberp4a5d4ar", "xn--mgbgu82a", "xn--mgbpl2fh", "xn--mgbtx2b", "xn--mgbx4cd0ab", "xn--mix891f", "xn--node", "xn--o3cw4h", "xn--ogbpf8fl", "xn--p1ai", "xn--pgbs0dh", "xn--q7ce6a", "xn--qxa6a", "xn--qxam", "xn--rvc1e0am3e", "xn--s9brj9c", "xn--wgbh1c", "xn--wgbl6a", "xn--xkc2al3hye2a", "xn--xkc2dl3a5ee0h", "xn--y9a3aq", "xn--yfro4i67o", "xn--ygbi2ammx", "ye", "yt", "za", "zm", "zw"};
        onExtraCallback = new String[]{"localdomain", "localhost"};
        asBinder = false;
        onTransact = strArr;
        asInterface = strArr;
        IAuthTabCallbackDefault = strArr;
        IAuthTabCallbackStub = strArr;
        IAuthTabCallback_Parcel = strArr;
        access100 = strArr;
        int i = access000 + 17;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static class IAuthTabCallback {
        private static final showCountDownText onExtraCallbackWithResult;
        private static final showCountDownText onWarmupCompleted;

        static {
            AnonymousClass1 anonymousClass1 = null;
            onExtraCallbackWithResult = new showCountDownText(false, anonymousClass1);
            onWarmupCompleted = new showCountDownText(true, anonymousClass1);
        }
    }

    public static showCountDownText onExtraCallbackWithResult(boolean z) {
        synchronized (showCountDownText.class) {
            asBinder = true;
            if (z) {
                return IAuthTabCallback.onWarmupCompleted;
            }
            return IAuthTabCallback.onExtraCallbackWithResult;
        }
    }

    private showCountDownText(boolean z) {
        this.domainRegex = new RegexValidator("^(?:\\p{Alnum}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?\\.)+(\\p{Alpha}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?)\\.?$");
        this.hostnameRegex = new RegexValidator("\\p{Alnum}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?");
        this.allowLocal = z;
        this.mycountryCodeTLDsMinus = IAuthTabCallbackDefault;
        this.mycountryCodeTLDsPlus = onTransact;
        this.mygenericTLDsPlus = asInterface;
        this.mygenericTLDsMinus = IAuthTabCallbackStub;
        this.mylocalTLDsPlus = access100;
        this.mylocalTLDsMinus = IAuthTabCallback_Parcel;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallbackStubProxy;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = $10 + 105;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35283), TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 35, 14239 - (Process.myPid() >> 22), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $11 + 31;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 10935), (ViewConfiguration.getTouchSlop() >> 8) + 65, Drawable.resolveOpacity(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 29, 17657 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 70, Color.green(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i13, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i14 = $10 + 83;
                $11 = i14 % 128;
                int i15 = i14 % 2;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i16 = $10 + 95;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i18 = $10 + 39;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] / iArr[3]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent %= 0;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* renamed from: o.showCountDownText$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            onWarmupCompleted = iArr;
            try {
                iArr[onExtraCallback.COUNTRY_CODE_MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onWarmupCompleted[onExtraCallback.COUNTRY_CODE_PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onWarmupCompleted[onExtraCallback.GENERIC_MINUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onWarmupCompleted[onExtraCallback.GENERIC_PLUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onWarmupCompleted[onExtraCallback.LOCAL_MINUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onWarmupCompleted[onExtraCallback.LOCAL_PLUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onWarmupCompleted[onExtraCallback.COUNTRY_CODE_RO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onWarmupCompleted[onExtraCallback.GENERIC_RO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onWarmupCompleted[onExtraCallback.INFRASTRUCTURE_RO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onWarmupCompleted[onExtraCallback.LOCAL_RO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public boolean IAuthTabCallback(String str) {
        int i = 2 % 2;
        if (str == null) {
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 63;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 113;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        if (strOnExtraCallbackWithResult.length() > 253) {
            return false;
        }
        String[] strArrOnExtraCallbackWithResult = this.domainRegex.onExtraCallbackWithResult(strOnExtraCallbackWithResult);
        if (strArrOnExtraCallbackWithResult != null) {
            int i7 = ICustomTabsCallback + 17;
            extraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                if (strArrOnExtraCallbackWithResult.length > 0) {
                    return onTransact(strArrOnExtraCallbackWithResult[0]);
                }
            } else {
                int length = strArrOnExtraCallbackWithResult.length;
                throw null;
            }
        }
        if ((!this.allowLocal) || !this.hostnameRegex.onNavigationEvent(strOnExtraCallbackWithResult)) {
            return false;
        }
        int i8 = extraCallback + 67;
        ICustomTabsCallback = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public boolean onTransact(String str) {
        int i = 2 % 2;
        if (this.allowLocal && !(!IAuthTabCallbackStub(str))) {
            return true;
        }
        if (!onWarmupCompleted(str)) {
            int i2 = ICustomTabsCallback + 49;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!onExtraCallback(str) && !onNavigationEvent(str)) {
                int i4 = extraCallback + 79;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        int i6 = ICustomTabsCallback + 15;
        extraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 83 / 0;
        }
        return true;
    }

    public boolean onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
            return onWarmupCompleted(IAuthTabCallback, IAuthTabCallbackDefault(onExtraCallbackWithResult(str).toLowerCase(Locale.ENGLISH)));
        }
        return onWarmupCompleted(IAuthTabCallback, IAuthTabCallbackDefault(onExtraCallbackWithResult(str).toLowerCase(Locale.ENGLISH)));
    }

    public boolean onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault(onExtraCallbackWithResult(str).toLowerCase(Locale.ENGLISH));
        if (!onWarmupCompleted(onExtraCallbackWithResult, strIAuthTabCallbackDefault)) {
            int i4 = ICustomTabsCallback + 49;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            String[] strArr = this.mygenericTLDsPlus;
            if (i5 == 0) {
                onWarmupCompleted(strArr, strIAuthTabCallbackDefault);
                throw null;
            }
            if (!onWarmupCompleted(strArr, strIAuthTabCallbackDefault)) {
                return false;
            }
        }
        return !onWarmupCompleted(this.mygenericTLDsMinus, strIAuthTabCallbackDefault);
    }

    public boolean onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 51;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault(onExtraCallbackWithResult(str).toLowerCase(Locale.ENGLISH));
        if (!onWarmupCompleted(onNavigationEvent, strIAuthTabCallbackDefault)) {
            int i4 = extraCallback + 37;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!onWarmupCompleted(this.mycountryCodeTLDsPlus, strIAuthTabCallbackDefault)) {
                return false;
            }
        }
        if (onWarmupCompleted(this.mycountryCodeTLDsMinus, strIAuthTabCallbackDefault)) {
            return false;
        }
        int i6 = extraCallback + 77;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public boolean IAuthTabCallbackStub(String str) {
        int i = 2 % 2;
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault(onExtraCallbackWithResult(str).toLowerCase(Locale.ENGLISH));
        if (!onWarmupCompleted(onExtraCallback, strIAuthTabCallbackDefault)) {
            int i2 = ICustomTabsCallback + 63;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!onWarmupCompleted(this.mylocalTLDsPlus, strIAuthTabCallbackDefault)) {
                return false;
            }
        }
        if (!(!onWarmupCompleted(this.mylocalTLDsMinus, strIAuthTabCallbackDefault))) {
            return false;
        }
        int i4 = extraCallback + 97;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private String IAuthTabCallbackDefault(String str) {
        int i = 2 % 2;
        if (str.startsWith(".")) {
            str = str.substring(1);
            int i2 = extraCallback + 105;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = extraCallback + 69;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        if (r2 != 65377) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[Catch: IllegalArgumentException -> 0x0083, PHI: r1
      0x003a: PHI (r1v10 java.lang.String) = (r1v8 java.lang.String), (r1v15 java.lang.String) binds: [B:14:0x0037, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0083, blocks: (B:6:0x001e, B:8:0x0028, B:16:0x003a, B:21:0x004b, B:36:0x0072, B:13:0x002f), top: B:39:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String onExtraCallbackWithResult(String str) {
        String ascii;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (asBinder(str)) {
            return str;
        }
        int i4 = extraCallback + 43;
        ICustomTabsCallback = i4 % 128;
        try {
            if (i4 % 2 != 0) {
                ascii = IDN.toASCII(str);
                int i5 = 85 / 0;
                if (!onWarmupCompleted.onExtraCallbackWithResult) {
                    int length = str.length();
                    if (length == 0) {
                        int i6 = ICustomTabsCallback + 115;
                        extraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return str;
                    }
                    char cCharAt = str.charAt(length - 1);
                    if (cCharAt != '.') {
                        int i8 = extraCallback + 95;
                        ICustomTabsCallback = i8 % 128;
                        if (i8 % 2 == 0 ? cCharAt != 12290 : cCharAt != 27059) {
                            if (cCharAt != 65294) {
                            }
                        }
                    }
                    return ascii + ".";
                }
            } else {
                ascii = IDN.toASCII(str);
                if (onWarmupCompleted.onExtraCallbackWithResult) {
                }
            }
            return ascii;
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    static class onWarmupCompleted {
        private static final boolean onExtraCallbackWithResult = onExtraCallbackWithResult();

        private static boolean onExtraCallbackWithResult() {
            return "a.".equals(IDN.toASCII("a."));
        }
    }

    private static boolean asBinder(String str) {
        int i = 2 % 2;
        if (str == null) {
            return true;
        }
        int i2 = extraCallback + 25;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < str.length(); i4++) {
            int i5 = extraCallback + 97;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 != 0) {
                if (str.charAt(i4) > 127) {
                    int i6 = extraCallback + 101;
                    ICustomTabsCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
            } else {
                if (str.charAt(i4) > 127) {
                    int i62 = extraCallback + 101;
                    ICustomTabsCallback = i62 % 128;
                    int i72 = i62 % 2;
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean onWarmupCompleted(String[] strArr, String str) {
        int i = 2 % 2;
        if (Arrays.binarySearch(strArr, str) < 0) {
            return false;
        }
        int i2 = ICustomTabsCallback;
        int i3 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 3;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void onExtraCallback() {
        IAuthTabCallbackStubProxy = new char[]{27254, 27198, 27174, 27260, 27180, 27172, 27172, 27257, 27175, 27175, 27177, 27260, 27176, 27178, 27174, 27330, 27480, 27456, 27483, 27329, 27496, 27489, 27179, 27268, 27294, 27289, 27291, 27290, 27267, 27169, 27285, 27281, 27304, 27303};
    }
}
