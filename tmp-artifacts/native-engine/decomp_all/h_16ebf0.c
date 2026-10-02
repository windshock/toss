// entry=0x16ebf0

void FUN_0026ebf0(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_002835d0;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(-0x2f859c01 - (-iVar1 ^ 0xffffffffU)) * 300 +
             (long)(int)(-0x2f859b5c - (-iVar1 ^ 0xffffffffU))])
            ((-iVar1 | 0xd07a6403U) + (-iVar1 & 0xd07a6403U),param_2,param_1,param_2);
                    /* WARNING: Could not recover jumptable at 0x0026ed08. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002795f0)();
  return;
}


