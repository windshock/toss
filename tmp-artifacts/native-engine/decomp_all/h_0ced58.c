// entry=0xced58

void FUN_001ced58(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027a6b8;
                    /* WARNING: Could not recover jumptable at 0x001cee34. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027a620)[(long)(int)(0x73ce9dad - (-iVar1 ^ 0xffffffffU)) * 0x65])
            (&PTR_FUN_0027c1e0 +
             (long)(int)((-iVar1 ^ 0x73ce9daeU) + (-iVar1 & 0x73ce9daeU) * 2) * 300 +
             (long)(int)((-iVar1 | 0x73ce9df7U) + (-iVar1 & 0x73ce9df7U)),param_1,param_2,param_1,
             param_4,param_3);
  return;
}


