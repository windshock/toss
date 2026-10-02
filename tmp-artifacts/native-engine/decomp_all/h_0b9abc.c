// entry=0xb9abc

void Hb9abc(void)

{
  undefined **ppuVar1;
  long in_x9;
  ulong in_x12;
  uint in_w13;
  ulong uVar2;
  long in_x14;
  long in_x15;
  ulong in_x16;
  ulong unaff_x23;
  long unaff_x24;
  
  if ((in_x16 & 1) != 0) {
    CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x001ba36c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00281eb0)();
    return;
  }
  uVar2 = in_x14 << (in_x12 & 0x3f);
  uVar2 = (uVar2 | *(byte *)(unaff_x24 + in_x15)) &
          (uVar2 & *(byte *)(unaff_x24 + in_x15) ^ 0xffffffffffffffff);
  if ((in_w13 & 1) == 0) {
    ppuVar1 = &PTR_LAB_00277558 +
              (long)(int)((-(int)DAT_00278c80 | 0xa47b2764U) * 2 -
                         (-(int)DAT_00278c80 ^ 0xa47b2764U)) * 0x60;
    if (((uVar2 ^ unaff_x23 ^ 0xffffffffffffffff) & uVar2) !=
        *(ulong *)(in_x9 + (0x13840d97a47b2763 - (-DAT_00278c80 ^ 0xffffffffffffffffU)) * 8)) {
      ppuVar1 = &PTR_LAB_00279980;
    }
                    /* WARNING: Could not recover jumptable at 0x001ba31c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001b9ab8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_Hb9abc_00280380)();
  return;
}


