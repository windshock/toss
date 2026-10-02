// entry=0xf03a4

void FUN_001f03a4(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = (int)DAT_00278c78;
                    /* WARNING: Could not recover jumptable at 0x001f0420. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((-iVar1 ^ 0xf082e2d3U) + (-iVar1 & 0x7082e2d3U) * 2) * 300 +
             (long)(int)((-iVar1 ^ 0xf082e3d4U) + (-iVar1 & 0xf082e3d4U) * 2)])
            ((-iVar1 | 0xf082e2d5U) * 2 - (-iVar1 ^ 0xf082e2d5U),param_2,param_1,param_2);
  return;
}


