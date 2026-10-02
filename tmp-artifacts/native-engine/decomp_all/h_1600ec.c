// entry=0x1600ec

ulong FUN_002600ec(int param_1)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  uint in_w4;
  uint in_w5;
  
  if (param_1 == 0) {
    uVar1 = -(int)DAT_0027a328;
                    /* WARNING: Could not recover jumptable at 0x002601e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar3 = (*(code *)(&PTR_LAB_00281350)[(int)((uVar1 | 0xbbcc9f84) * 2 - (uVar1 ^ 0xbbcc9f84))])
                      ((in_w4 ^ 0xffff0000) & in_w4);
    return uVar3;
  }
  if (param_1 == 1) {
    uVar1 = (in_w4 << 1 | -in_w5) + (in_w4 << 1 & -in_w5);
    return (ulong)((uVar1 ^ 0xffff0000) & uVar1);
  }
  uVar2 = (int)((in_w5 | in_w4) + (in_w5 & in_w4)) / 0xffff;
  uVar1 = -(int)DAT_0027a328;
  return (ulong)((uVar2 ^ (uVar1 | 0xbbcd9f78) + (uVar1 & 0xbbcd9f78) ^ 0xffffffff) & uVar2);
}


