// entry=0xe53e8

void He53e8(void)

{
  long lVar1;
  long unaff_x19;
  
  lVar1 = *(long *)(unaff_x19 + 0xa0);
  *(undefined4 *)(lVar1 + 4) = 0;
  *(undefined4 *)(lVar1 + 8) = 0;
  *(undefined4 *)(lVar1 + 0xc) = 0;
                    /* WARNING: Could not recover jumptable at 0x001e5414. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027d490)(DAT_00282201);
  return;
}


