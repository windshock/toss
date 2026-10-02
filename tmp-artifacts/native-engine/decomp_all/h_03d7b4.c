// entry=0x3d7b4

void H3d7b4(ulong param_1)

{
  int iVar1;
  
  if ((param_1 & 1) == 0) {
    iVar1 = (int)DAT_0027f128;
                    /* WARNING: Could not recover jumptable at 0x0013d644. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&PTR_LAB_0027bb08)[(long)(int)(-0xf3eb40a - (-iVar1 ^ 0xffffffffU)) * 0x6c])
              (&PTR_FUN_0027c1e0 +
               (long)(int)((-iVar1 ^ 0xf0c14bf7U) + (-iVar1 & 0xf0c14bf7U) * 2) * 300 +
               (long)(int)((-iVar1 ^ 0xf0c14c04U) + (-iVar1 & 0xf0c14c04U) * 2));
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0013d7a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00278278)(DAT_002862c8 & 1);
  return;
}


