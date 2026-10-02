// entry=0xf811c

void FUN_001f811c(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_0027ba80;
                    /* WARNING: Could not recover jumptable at 0x001f8188. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(0x415bbf6c - iVar1) * 300 +
             (long)(int)((-iVar1 | 0x415bbf97U) * 2 - (-iVar1 ^ 0x415bbf97U))])
            ((-iVar1 | 0x415bbf70U) * 2 - (-iVar1 ^ 0x415bbf70U),param_2,param_1,param_2);
  return;
}


