// entry=0x59034

void H59034(long *param_1)

{
  undefined **ppuVar1;
  uint uVar2;
  bool bVar3;
  bool bVar4;
  long in_x9;
  char *in_x12;
  char in_w14;
  ulong in_x15;
  
  if ((in_x15 & 1) == 0) {
    uVar2 = -(int)DAT_00275ca8;
    ppuVar1 = &PTR_LAB_00282e78;
    if (in_w14 != *in_x12) {
      ppuVar1 = &PTR_LAB_00281350 + (int)((uVar2 | 0xf97b153d) + (uVar2 & 0xf97b153d));
    }
                    /* WARNING: Could not recover jumptable at 0x0015ea44. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
  if (*in_x12 == '\0') {
    param_1 = (long *)param_1[0xd];
    bVar3 = *(long **)(in_x9 + 0x68) != (long *)0x0;
    bVar4 = param_1 != (long *)0x0;
    if (bVar3 == !bVar4 || !bVar3) {
      ppuVar1 = &PTR_LAB_00286000;
      if ((!bVar3 || !bVar4) && bVar3 == bVar4) {
        ppuVar1 = &PTR_LAB_00282678;
      }
                    /* WARNING: Could not recover jumptable at 0x00159f3c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)*ppuVar1)();
      return;
    }
    if (**(long **)(in_x9 + 0x68) == *param_1) {
                    /* WARNING: Could not recover jumptable at 0x0015cf6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00280c00)();
      return;
    }
  }
  uVar2 = -(int)DAT_00275ca8;
  ppuVar1 = &PTR_LAB_00286000 + (long)(int)((uVar2 ^ 0xf97b14d4) + (uVar2 & 0xf97b14d4) * 2) * 0x68;
  if (*(char *)((long)param_1 + 0x62) != (byte)(-0x2d - (-(char)DAT_00275ca8 ^ 0xffU))) {
    ppuVar1 = &PTR_LAB_0027edb8;
  }
                    /* WARNING: Could not recover jumptable at 0x00149a98. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


