// entry=0xc5df8

ulong FUN_001c5df8(int param_1)

{
  uint uVar1;
  ulong uVar2;
  int in_w4;
  int in_w5;
  
  if (param_1 != 0) {
    uVar1 = (-(int)DAT_00274ae8 ^ 0x13aedac6U) + (-(int)DAT_00274ae8 & 0x13aedac6U) * 2;
    uVar1 = in_w4 << 1 & uVar1 | in_w4 << 1 ^ uVar1;
    uVar1 = (uVar1 ^ -in_w5) + (uVar1 & -in_w5) * 2;
    return (ulong)((uVar1 ^ 0xffff0000) & uVar1);
  }
  uVar2 = (*(code *)PTR_FUN_00275a70)();
  return uVar2;
}


