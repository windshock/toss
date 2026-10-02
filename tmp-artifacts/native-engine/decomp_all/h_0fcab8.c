// entry=0xfcab8

void Hfcab8(void)

{
  undefined4 *unaff_x24;
  ulong unaff_x26;
  
  *unaff_x24 = 0x42424242;
  memset(unaff_x24 +
         ((-DAT_00280f50 | 0xe5eb2050b52367f2U) * 2 - (-DAT_00280f50 ^ 0xe5eb2050b52367f2U)),0,0xc);
                    /* WARNING: Could not recover jumptable at 0x001fba30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002774d8)(unaff_x26 >> 2);
  return;
}


