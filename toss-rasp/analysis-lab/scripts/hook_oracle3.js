// §117e — EXACT decode via NativeFunction on the registered native primitives
// (frida long->double marshaling destroys >2^53 precision; NativeFunction int64 is exact).
var fnB = null, fnC = null, clsB = null, clsC = null, envH = null;
var done = false;
var THEX = "caaba2dc1a54f3cd6b7dc0e1b811118b8902edb585cf3d5ad4f94c6fe7f49f0e36c9ae1341baf968908008d1a0565bc6f36a6ae90252b5822d14c4937c26dd9db5e10d73e4d77c5fd7d4af2206999e357184c906a08b38ed90646bfbc32dab5713c2fa6162f7c96cb196185180856f21d7aebe6526718ede755eddfe446a2ce09b02039aea3c52bd3930a1aa09d5f045a368cb0b73939a2602baa92cd1c17879e0d30f66b7f5de654614ee9b1519bdb924344ca0edbe85c03d48d4ea4c2ee7f19f0b3689ae1b41e7f91590aa08dba0515bd7f3620c486430dcae3510ad8106017eebd76b4fc1a05d18c0714ee91e41bfba23129fede085943d5ad4e94c65e7fe9f0836deae4541f9f92790e2089ba0125b86f33a6ab10229b58a2d43c4c07c2c17ec8f34271ade8c7657e9ba817c38f0d0564bc9e3419aa73267aa1d5d90f55b6cba043ebfab570dce80664a19acb17428e0c0ca784213888b3f22a8da234dd5e5489c943429afba4734ff4796dd0e05a1b7597c17107f39c7ad2e4db6901d0865f8cc7154babb5d03d06a40f2395ae6a17009999045f8824f7fd7ec3e67868fed4975c5ddef242c8caf13457b8fc2002aa0b16d19e36052c89b50b9a7300fa8964efe974508adac34739ce4e30a4bd1d2163a3882e6e927719ed80b2084b72b1fee6636ce8d551bbdc505e26c29f4f65b10a3d9edbd85cc3d10d4ff4c6fe7ee9f1936c9ae1a41acf92790a708dda0575bd7f37c6aaa0261b58f2d02c49d7c2817b48f232702decc765fe9ad816c38f4d0124b8fe3159ab83270aa4a5dd0f54d6cf80468bfea570ccec8663c19aeb12328bec0c6784a13d48b5e22fada694da9e5159c9a3429afaa4722ff4a96db0e61a1e3596ff0c468000387bb0e52b8ca2d625815c28d4f24fadc4877f2ef1e868c3e15d1ae4930e0b898c13055abfb4379fabe923305a9bd015482cc2667aa1f3bb7432ed3c66779f81170889f2008db98733eeaae823f3a65adc7455efcea94610ff3a75b5ed6edbd85cc3d10d4ff4c6fe7ee9f1936c9ae1a41acf92790a708dda0575bd7f37c6aaa0279b5812d16c4957c6317b98f38275ededc7618e9f6817138bbd0104b9ae3179ab8323daa475dc5f54f6cfc046ebff9571ecec8660519a1b12028a5c0c7784b13dd8b6a22feda624dc3e51e9c843438aff74717ff4e96d70e40a1ec596bf0c0680e038ebb1d52a9ca38625d15ef8d5324e5dc6277f6ef1a86c13e56d18a493ce0a598cb3049abde436cfaf692440595bd175482cc2b67bd1f21b74b2edcc67879e0117388892004db9c737213cf7bbec3622a8db21d199c616bc8bb5069bfd7075b6ec3f6bb5e3ba5ee0d1b9493fc024be8d37c3af0825ae9db710bd93620a4882917947f44c6812e75b5ec1d7264c6cc5e543ca3a10b619299fa16418da97430e1986fe7ce4f19d6cf3ebb8630edb07519dc9d243db3fe1b6b62e6ca5151deb94a012568e4f0005f9ca7020e849672fde04571acdd34429c3deb94732dda98221b8994117478e3c04f2fdbb7501ed066b9ce3d5583bd1c048b6c0afbeb4365aaf0327099c9e1534939d0bb382f8787ef1576bdde3625ca8d4014c17c4bc42953babb2002966a24f1995973a0e2086b97d9ff5d46cbaebc36049da4e5134c89d40023f08b3b12b2edbd85cc3d10d4ff4c6fe7ee9f1936c9ae1a41acf92790a708dda0575bd7f37c6aaa027cb5972d1fc4917c3917bb8f792759ded07618e9e5816d38fbd00c4b9ae3189aef3230aa4a5dd6f5546ced0466bfe85700ce89661d19e6b10828abc0cb784513c58b6f22c9da754d83e51f9c803402afb84720ff6b96d70e46a1f65954f0e0684503dabb0e52b8ca29624f15d58d5224e8dc6a77c0ef11868b3e06d1a74921e0a598c73058abfc436cfaf792750588bd1854c2cc71eda285c83d48d4ea4c2ee7ef9f0f3697ae0941abf92a90ba08cba0445b9cf37b6aeb0262b59d2d55c4917c2317bb8f3b2755decd765fe9e0816b38bbd0034b8fe3049ab23238aa475dd9f5586cf80429bfdf5708ce8b660319a9b12c28b5c0c1786013d48b6b22ebda5c4d84e5149c9c340aafbc4722ff4096d00e50a1f05956f0f968110392bb6f52e4ca18625215d38d5924fbdc6877f2ef0486b63e0bd1a14930e0b998cb304fabd9436efad692760581bd1b5492cc2267ea9f98f7e14f7ca68a3e4895dded2a44afdc3f33838b47e29d7ae9d26e29ef814f18c2705ac7ef5f33b6b20e1165dbfd11556dace2047c9bdef3594adba22139fe913ae88a4002d82a2ff587681ec4764acdc433c65bb7e36b0a84921439954162e8b270619fd7275c4edcd6a67e2c85ac2d07b4d1dc0b6bf6f3631ae4a243c9cf5158f90800b6a828378a5f0ee6870e7795e53d7b44d5ec57747e83ae2b2fb2dfda0f6184896010f8b86dc7dd6f10f6e81eb7a63ccda55500fc8e041f93c23b6442feea5a71cb9943213948b7d02b7fad87162e8eb674ddf665568cde1454bc03cbb95334fa870211a99c315058f1e0670fc0975e3ec346bbee2575b99d3d24954c48dbb363478af5124cb9c6c15c6937f0a51823a7a9cf1c56fefe6f05eead5434c85c4ee43173919b29229e4a1cd18d797580a7edbd85cc3d10d4ff4c6fe7ee9f1936c9ae1a41acf92790a708dda0575bd7f37c6aaa027cb5972d1fc4917c3917bb8f792759ded07618e9e5816d38fbd00c4b9ae3189aef322daa485dd2f5586cef0469bfb2571fce8f661619bfb16b2891c0c0784913c18b6122e8da714d8fe5169c92341fafb04738ff4496d40e50a1f65970f0fa681203dabb1952afca31624615ce8d5224eedc5277faef1c86893e17d1844930e0f5988a307eabc84379faff92650582bd18549acc1067a11f3bb7562ed7c65179f511778888202cdb9c7327eaa582383a48ad96dc11b4600cbce5537dc3d642aeb507659fb67000c88ba10b397191fb6a7bc2d05b0633c884311cb2f52e4d8e2618be9916efef7447e8d84bb0dd0957e1a97a7dd2b7ab1b03979bf56c7fc4f45d4735d88e1e6697ff6e57b62800edbd85cc3d10d4ff4c6fe7ee9f1936c9ae1a41acf92790a708dda0575bd7f37c6aaa0267b58b2d09c4997c2b17a38f79275fded47645e9ad817138f8d0124b93e35a9a923233aa585df6f55c6cf8046ebffd5707ce92662619bbb12028a0c0e6784a13d78b6122ddda624d8ce51d9c9a3429afb74722ff07969c0e70a1fa596bf0f168130390bb2a52acca0e625315c98d4824e1dc6377e7ef0186863e3ed1ae4929e0b398ca305aab86433dedbd85cc3d10d4ff4c6fe7ee9f1936c9ae1a41acf92790a708dda0575bd7f37c6aaa0279b5812d16c4957c6317bc8f32274ddecd7643e9f1817d38bbd0014b9ee3079aa93238aa475dcff54a6ca40474bfff571bce83661619a6b16b28b1c0c0784913c18b6122f5da754d83e50e9cd9340fafb84725ff4b96de0e59a1ed5968f0c06813039fbb2552b3ca3c624915d38d5524e6dc6877dfef0186963e06d1844930e0f5988a307eabc84379faff92650582bd18549acc1067a11f3bb7562ed7c65179f511778888202cdb9c7327eaa582383a48ad97450291def98a4108a8a2303b9bb2e3564acdd2603de6857becededb085c43d4ad4ee4c63e7e99f0f3683edb585d53d4ad4ee4c6ee7f99f033689ae1b418df92390a708cda0465bc6f3606af60242b58b2d0fedb385d43d5fd4f94c64e7d19f0f3691ae1941a5eda485ce3d4dd4ff4c52e7fc9f193697ae2e41acf93590a608c4a051ed8685e03d6dd4dbeda685c03d4dd4fb4c45e7f09f1f368bae1d41bdf92990a108eba0445bdef3636ae60270b58d2d10c4d07c3917b28f252749ded87642e9a3817c38f0d0164b9ae3179ab5323baa4f5d8ef51d6cce0462bffe571cce81663a19a6b12328bdc08f781e1391edb585d13d4ed4ee4c6ee7f9a43ccc5274f19d6305eeae68d6987f1ca071edb085c43d5cd4fe4c67e7d49f043681ae13c0d5a8b71025f9896112caa5b27beda685c03d4dd4fb4c45e7f09f1f368bae1d41bdf92990a108eba0445bdef3636ae60270b58d2d10c4d07c2917bf8f232749deda7642e9e6817c3f2c575cefc3eda685c03d4dd4fb4c43e7f89f183693ae1541aff92f90b008c9a0515bd7f37b6ae5027cb59e2d1ec4827c0e17bb8f3b2740dedb7657e9e0817338b5d0164b97e3069aa4323faa5f5d80f5596cef0473bff9570ace92661619acb16b28f2c0eb784113d38b7b22fcda594d83e51c9c98346cafe34776c5fbad9d1510fca6641ecfa5b7451ece864869f2d172b8ed2094880c738adb2642b82a219dc30543ecdf54533fe6a7660f1df6865e0ac1bda92e10e8f85b63c7cb5db2f91a6082027598dd0477701f16a79b4e2dd69e7d2405d3ac5a34e9db7e63fc0a69921c3a92c10769b2f07298b32f50b7df5e43e6fa8d7815a1bd9e440aec9473301bada2374ad1d14d798c0037a8cc3098c7146f9ef63b9e982524cdd9545ffc8583242bb3edf4858e3d1ed4d94c6fe7f29f1e36a3ae1941bdf92390b008dca04c5bddf3616ac2027db58f2d1cc4d07c7717fae4138c7b34e4dd4a45f1ee4d96ab3f37a7aa4808f09a99090173a9d6526bfadb6356eda685c03d4dd4fb4c48e7f29f05368cae3f41a8f92a90bf08caa0445bd1f3646aa40275b58b2d0fc4957c2e17ae8f3227484c0a246c9ce17557edfa46583eb4973f0fa5e0045886311aa96a01fffa7752d1cb47a3d3142f8cb26532dd95b6352e9a86ec7f79d7f8484e20d7995271eeea2742b03b1f93970be6fc7854b1cd42a5ce1e44f6a06f29c7abb801108d89506123d9ccb2782ac083427bdbec0844b83d3d958f0e55e6c05eaf91bef9d84155a8e3304e9bece3004a8bd2113db08532ecae74dedc4b27c38f6516f37e67c99b5106b88600216b81f32e5b58a2cd0a4c95fafd6344e6ac5a37839f09e6ad4e23d65021cc894010f6f13a995c21d1c86750cefb6e83992a0fb2a35d34e5b68c231456bcd8474deff876381ef9a91a3195d80960b00b3293eb3bd4c2406adef57a9de7247dcc9b5707ffc6867d2e86b6d2415ee9d4707118d2a36e4b93d2157acf056eadf91dd975bfcd322484bc2d178d6f7ac6ec5e40b1d7095560c0f8b5503babae031b9adbf20a45f4dd7034ea8c51e7d17f4dd737eda685c03d4dd4fb4c44e7f89f083692ae1b418af92790bf08c4a0475bd3f36c6aef0231b59a2d13c4827c2817bb8f23270cdedd7653e9f7817d38f6d0164b9ae3109aef327eaa6f5dc5f55f6cff0460bfd55707ce80661c19e8b17f28f2197b711dc9902026b89913256bd5c24f5ac6b5570dfa6462fc19549aaf0e07b19e32f6ec4157d9c3305988f5e3647bfed3942a00";
var T = [];
for (var q = 0; q < THEX.length; q += 8) {
    T.push(parseInt(THEX.substr(q, 4), 16) * 256 + parseInt(THEX.substr(q + 4, 4), 16));
}
Java.perform(function () {
    try { Java.use("java.lang.System").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try { Java.use("java.lang.Runtime").exit.implementation = function (c) { send({ev: "exit-blocked", code: c}); }; } catch (e) {}
    try {
        envH = Java.vm.tryGetEnv().handle;
        var vtbl = envH.readPointer();
        var regNat = vtbl.add(215 * Process.pointerSize).readPointer();
        Interceptor.attach(regNat, {
            onEnter: function (args) {
                var count = args[3].toInt32();
                var methods = args[2];
                var cn = "?";
                try { Java.perform(function () { cn = "" + Java.cast(args[1], Java.use("java.lang.Class")).getName(); }); } catch (e) {}
                for (var i = 0; i < count && i < 128; i++) {
                    var m = methods.add(i * 3 * Process.pointerSize);
                    var nm = m.readPointer().readCString();
                    var sg = m.add(Process.pointerSize).readPointer().readCString();
                    var fp = m.add(2 * Process.pointerSize).readPointer();
                    if (nm === "b" && sg.indexOf("(JJJI)J") >= 0) send({ev: "regB", cls: cn, fn: "" + fp});
                    if (nm === "c" && sg.indexOf("(I)J") >= 0) send({ev: "regC", cls: cn, fn: "" + fp});
                    if (cn === "o.s5a$onExtraCallbackWithResult" && nm === "b") { fnB = fp; clsB = args[1]; send({ev: "gotB-s5a", fn: "" + fp}); }
                    if (cn === "o.getPageByNodeId" && nm === "c") { fnC = fp; clsC = args[1]; send({ev: "gotC-pgbn", fn: "" + fp}); }
                }
            }
        });
    } catch (e) { send({ev: "rn-err", err: "" + e}); }
    var natTimer = setInterval(function () {
        var base = null;
        try { base = Module.findBaseAddress("libea56.so"); } catch (e) {}
        if (!base) return;
        clearInterval(natTimer);
        try { Interceptor.replace(base.add(0x95224), new NativeCallback(function () { send({ev: "sd-blocked"}); return 0; }, "int", [])); } catch (e) {}
    }, 100);
    var tries = 0;
    var timer = setInterval(function () {
        if (tries > 4000) { clearInterval(timer); return; }
        tries++;
        if (fnB && fnC && !done) {
            done = true; clearInterval(timer);
            Java.perform(function () {
                var facHolder = null;
                try {
                    Java.enumerateClassLoaders({
                        onMatch: function (loader) {
                            if (facHolder) return;
                            try {
                                var f2 = Java.ClassFactory.get(loader);
                                f2.use("o.ReusableBufferedOutputStream");
                                facHolder = f2;
                            } catch (e) {}
                        },
                        onComplete: function () {}
                    });
                } catch (e) {}
                try {
                    var B = new NativeFunction(fnB, 'int64', ['pointer', 'pointer', 'int64', 'int64', 'int64', 'int32']);
                    var C = new NativeFunction(fnC, 'int64', ['pointer', 'pointer', 'int32']);
                    var R = int64("-3122170889257122399");
                    function lo16(v){ return v.and ? v.and(0xFFFF).toNumber() : Number(BigInt(v) & 0xFFFFn); }
                    // validate c(i)=i^0xEDD4 exactly
                    var cok = 0;
                    for (var i = 0; i < 64; i++) {
                        var x = (i * 997) & 0xFFFF;
                        var cv = lo16(C(envH, clsC, x));
                        if (cv === (x ^ 0xEDD4)) cok++;
                    }
                    send({ev: "cval", ok: cok});
                    // exact b probes
                    var bp = [];
                    for (var k = 0; k < 6; k++) {
                        bp.push([0x1234, k, (B(envH, clsB, 0x1234, k, R, 0)).toString(16)]);
                        bp.push([0xABCD, k, (B(envH, clsB, 0xABCD, k, R, 0)).toString(16)]);
                    }
                    send({ev: "bexact", d: bp});
                    // statefulness probe: same args, interleaved order
                    try {
                        var J0 = 0x1234;
                        var s1 = B(envH, clsB, J0, 0, R, 0).toString(16);
                        var s2 = B(envH, clsB, J0, 0, R, 0).toString(16);
                        var m1 = B(envH, clsB, J0, 1, R, 0).toString(16);
                        var s3 = B(envH, clsB, J0, 0, R, 0).toString(16);
                        var m2 = B(envH, clsB, J0, 1, R, 0).toString(16);
                        send({ev: "state", k0a: s1, k0b: s2, k0c: s3, k1a: m1, k1b: m2});
                    } catch (e) { send({ev: "state-err", err: "" + e}); }
                    // decode all tuples: out[k] = char( B( c(T[i+k]), k, R, cchar ) )
                    var tuples = [[9,22,0],[31,15,12332],[90,16,0],[106,16,57845],
                                  [1169,108,0],[46,26,11928],[72,18,20191],
                                  [466,126,65138],[592,92,0],[684,93,0],
                                  [818,113,56955],[931,107,0]];
                    for (var ti = 0; ti < tuples.length; ti++) {
                        var t = tuples[ti];
                        var s = "";
                        try {
                            for (var k2 = 0; k2 < t[1]; k2++) {
                                var cv2 = lo16(C(envH, clsC, T[t[0] + k2]));
                                var bv = B(envH, clsB, cv2, k2, R, t[2]);
                                s += String.fromCharCode(lo16(bv));
                            }
                        } catch (e) { s = "<err " + e + ">"; }
                        send({ev: "dec", i: t[0], n: t[1], c: t[2], s: s});
                    }
                    send({ev: "oracle-done"});
                } catch (e) { send({ev: "of-err", err: "" + e}); }
            });
        }
    }, 20);
});
