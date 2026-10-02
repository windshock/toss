// entry=0x13b9ec

void H13b9ec(undefined8 *param_1)

{
  uint uVar1;
  uint uVar2;
  undefined4 unaff_w22;
  undefined1 auVar3 [16];
  
  DAT_0029e868 = (*(code *)*param_1)();
  uVar1 = -(int)DAT_00279eb0;
  uVar2 = -(int)DAT_00279eb0;
  DAT_0029e378 = unaff_w22;
  auVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                     [(long)(int)((uVar1 | 0x8692046) + (uVar1 & 0x8692046)) * 300 +
                      (long)(int)((uVar2 ^ 0x8692116) + (uVar2 & 0x8692116) * 2)])(3);
  uVar1 = -(int)DAT_00279eb0;
  uVar2 = -(int)DAT_00279eb0;
                    /* WARNING: Could not recover jumptable at 0x0023bb78. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_H13b4c4_0027cfb8)
            ((&PTR_FUN_0027c1e0)
             [(long)(int)((uVar2 | 0x8692046) + (uVar2 & 0x8692046)) * 300 +
              (long)(int)((uVar1 | 0x869205a) * 2 - (uVar1 ^ 0x869205a))],auVar3._0_8_,auVar3._8_8_,
             auVar3._0_8_);
  return;
}


