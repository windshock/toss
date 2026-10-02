// entry=0x145f30

void H145f30(undefined8 *param_1)

{
  undefined **ppuVar1;
  bool bVar2;
  undefined8 *in_x9;
  ulong in_x11;
  ulong in_x12;
  long unaff_x28;
  
  switch(*param_1) {
  case 0:
    bVar2 = (in_x12 & in_x11 | in_x12 ^ in_x11) ==
            (-DAT_00279b20 ^ 0xacc6d7f8333596aeU) + (-DAT_00279b20 & 0xacc6d7f8333596aeU) * 2;
    ppuVar1 = &PTR_LAB_00282dc8;
    if ((unaff_x28 != 0 || !bVar2) && (unaff_x28 == 0) == bVar2) {
      ppuVar1 = (undefined **)&DAT_00276280;
    }
                    /* WARNING: Could not recover jumptable at 0x00246d1c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar1)();
    return;
  case 2:
                    /* WARNING: Could not recover jumptable at 0x00245fe4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027f090)();
    return;
  case 5:
    break;
  case 6:
                    /* WARNING: Could not recover jumptable at 0x00247a9c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_002824d0)();
    return;
  case 7:
  case 0x11:
    break;
  case 8:
  case 0x12:
                    /* WARNING: Could not recover jumptable at 0x00245c20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027f090)();
    return;
  case 0x17:
                    /* WARNING: Could not recover jumptable at 0x00246de8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_H145864_0027e568)();
    return;
  }
  ppuVar1 = &PTR_H145f30_0027faa0;
  if (in_x9 <= param_1 + ((-DAT_00279b20 ^ 0xacc6d7f8333596afU) +
                         (-DAT_00279b20 & 0xacc6d7f8333596afU) * 2) * 2) {
    ppuVar1 = &PTR_LAB_0027f3d0;
  }
                    /* WARNING: Could not recover jumptable at 0x00247588. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


