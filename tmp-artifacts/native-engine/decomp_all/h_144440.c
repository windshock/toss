// entry=0x144440

void FUN_00244440(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_00277cd8;
                    /* WARNING: Could not recover jumptable at 0x002444b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 | 0x2199c80dU) + (-iVar1 & 0x2199c80dU)) * 300 +
             (long)(int)((-iVar1 | 0x2199c8e2U) * 2 - (-iVar1 ^ 0x2199c8e2U))])
            ((-iVar1 | 0x2199c80eU) + (-iVar1 & 0x2199c80eU),param_2,param_1,param_2);
  return;
}


