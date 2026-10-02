// entry=0x131154

void H12c3ec(undefined *param_1)

{
  int iVar1;
  undefined *in_x17;
  long unaff_x19;
  undefined8 unaff_x24;
  
  iVar1 = (int)DAT_00281e58;
  if ((param_1 >=
       (&PTR_FUN_0027c1e0)
       [(long)(int)((-iVar1 ^ 0xcc88cf42U) + (-iVar1 & 0xcc88cf42U) * 2) * 300 +
        (long)(int)(-0x337730bf - (-iVar1 ^ 0xffffffffU))] ||
      (&PTR_FUN_0027c1e0)
      [(long)(int)(-0x337730bf - (-iVar1 ^ 0xffffffffU)) * 300 +
       (long)(int)(-0x337730bf - (-iVar1 ^ 0xffffffffU))] >= in_x17) &&
      param_1 < (&PTR_FUN_0027c1e0)
                [(long)(int)((-iVar1 ^ 0xcc88cf42U) + (-iVar1 & 0xcc88cf42U) * 2) * 300 +
                 (long)(int)(-0x337730bf - (-iVar1 ^ 0xffffffffU))] ==
      (&PTR_FUN_0027c1e0)
      [(long)(int)(-0x337730bf - (-iVar1 ^ 0xffffffffU)) * 300 +
       (long)(int)(-0x337730bf - (-iVar1 ^ 0xffffffffU))] < in_x17) {
    DAT_0029e360 = param_1;
    DAT_0029e550 = in_x17;
                    /* WARNING: Could not recover jumptable at 0x0022b468. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027e6c0)();
    return;
  }
  *(undefined8 *)(unaff_x19 + 0x7f8) = unaff_x24;
                    /* WARNING: Could not recover jumptable at 0x00232afc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00277900)();
  return;
}


