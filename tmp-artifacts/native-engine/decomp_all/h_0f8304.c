// entry=0xf8304

void FUN_001f8304(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  int iVar1;
  
  iVar1 = (int)DAT_00281710;
                    /* WARNING: Could not recover jumptable at 0x001f8374. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(-0x5c95ac7 - iVar1) * 300 +
             (long)(int)((-iVar1 | 0xfa36a5ffU) * 2 - (-iVar1 ^ 0xfa36a5ffU))])
            ((-iVar1 | 0xfa36a539U) + (-iVar1 & 0xfa36a539U),param_2,param_1,param_2,param_3,param_4
            );
  return;
}


