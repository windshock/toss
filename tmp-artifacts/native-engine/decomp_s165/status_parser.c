// entry_off=1053dc name=FUN_002053dc body=[[002053dc, 00205417] [00208e34, 00208e43] [00209c00, 00209c1b] [0020d668, 0020d6c7]]

void FUN_002053dc(void)

{
  undefined8 uVar1;
  
  uVar1 = tpidr_el0;
                    /* WARNING: Could not recover jumptable at 0x0020d6c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00281dc8)
            [(long)(int)((-(int)DAT_00280ba0 ^ 0x96034946U) + (-(int)DAT_00280ba0 & 0x96034946U) * 2
                        ) * 0x6c])();
  return;
}


