// entry=0x11a998

void H11a998(void)

{
  undefined1 *puVar1;
  uint in_w3;
  int iVar2;
  
  iVar2 = (int)DAT_00281e58;
  DAT_00286318 = (-iVar2 ^ 0xcc88cf42U) + (-iVar2 & 0xcc88cf42U) * 2;
  puVar1 = &DAT_00282838;
  if ((in_w3 & 1) == 0) {
    puVar1 = &DAT_0027a318;
  }
                    /* WARNING: Could not recover jumptable at 0x002113b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002748d0)
            (&PTR_FUN_0027c1e0 +
             (long)(int)(-0x337730bf - (-iVar2 ^ 0xffffffffU)) * 300 +
             (long)(int)((-iVar2 ^ 0xcc88d01dU) + (-iVar2 & 0xcc88d01dU) * 2),puVar1);
  return;
}


