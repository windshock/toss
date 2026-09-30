// FUN_0015a054 @0015a054

void FUN_0015a054(long param_1)

{
  long lVar1;
  long in_x9;
  ulong uVar2;
  long unaff_x19;
  
  lVar1 = (long)&stack0x00000000 - (in_x9 + 0xfU & 0xfffffffffffffff0);
  param_1 = param_1 << ((-DAT_00275ca8 | 0x14f4U) + (-DAT_00275ca8 & 0x14f4U) & 0x3f);
  uVar2 = -DAT_00275ca8;
  *(long *)(unaff_x19 + 0xe8) = lVar1;
  if (param_1 != (uVar2 | 0x642804bbf97b14d4) * 2 - (uVar2 ^ 0x642804bbf97b14d4)) {
    FUN_0014a080();
    return;
  }
  *(undefined1 *)(lVar1 + (param_1 >> 0x20)) = 0;
  (*(code *)PTR_FUN_0027dd88)();
  return;
}

