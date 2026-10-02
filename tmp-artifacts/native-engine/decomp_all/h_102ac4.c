// entry=0x102ac4

void H102ac4(void)

{
  uint uVar1;
  uint uVar2;
  int in_w8;
  uint in_w12;
  int iVar3;
  
  iVar3 = (int)DAT_00281e20;
  uVar2 = (-iVar3 | 0x9cf614b8U) * 2 - (-iVar3 ^ 0x9cf614b8U);
  uVar1 = 0;
  if ((-iVar3 ^ 0x9cf614cfU) + (-iVar3 & 0x9cf614cfU) * 2 <= (in_w12 | uVar2) * 2 - (in_w12 ^ uVar2)
     ) {
    uVar1 = in_w12;
  }
  if (uVar1 != 0x9cf614cf - (-iVar3 ^ 0xffffffffU)) {
    CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x00202ebc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*DAT_0027c070)((-DAT_00281e20 | 0x8ad1e1cb9cf614d2U) * 2 -
                    (-DAT_00281e20 ^ 0x8ad1e1cb9cf614d2U));
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00202b34. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027f060)(in_w8 >> 8);
  return;
}


