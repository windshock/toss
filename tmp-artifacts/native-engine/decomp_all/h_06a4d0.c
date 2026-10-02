// entry=0x6a4d0

void FUN_0016a4d0(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027fb38;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0x70ec0becU) + (-iVar1 & 0x70ec0becU)) * 300 +
             (long)(int)((-iVar1 | 0x70ec0c89U) + (-iVar1 & 0x70ec0c89U))])
            ((-iVar1 ^ 0x70ec0bedU) + (-iVar1 & 0x70ec0bedU) * 2,param_2,param_1,param_2,param_3);
                    /* WARNING: Could not recover jumptable at 0x0016a550. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_002778f8)
            [(long)(int)((-(int)DAT_0027fb38 | 0x70ec0becU) + (-(int)DAT_0027fb38 & 0x70ec0becU)) *
             0x52])();
  return;
}


