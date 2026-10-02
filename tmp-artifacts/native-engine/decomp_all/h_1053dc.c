// entry=0x1053dc

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


