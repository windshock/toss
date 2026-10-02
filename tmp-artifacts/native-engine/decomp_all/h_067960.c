// entry=0x67960

void FUN_00167960(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_00276c48;
                    /* WARNING: Could not recover jumptable at 0x001679d8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0xa28c0724U) + (-iVar1 & 0x228c0724U) * 2) * 300 +
             (long)(int)((-iVar1 ^ 0xa28c07dfU) + (-iVar1 & 0xa28c07dfU) * 2)])
            ((-iVar1 ^ 0xa28c0726U) + (-iVar1 & 0xa28c0726U) * 2,param_2,param_1,param_2);
  return;
}


