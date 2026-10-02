// entry=0xe5730

void He5730(undefined8 param_1)

{
  char cVar1;
  undefined **ppuVar2;
  bool bVar3;
  bool bVar4;
  long in_x4;
  char in_w5;
  long in_x6;
  undefined8 in_x12;
  uint in_w16;
  long in_x17;
  long unaff_x19;
  undefined8 unaff_x24;
  
  cVar1 = (char)DAT_002765f0;
  *(undefined8 *)(unaff_x19 + 0x78) = unaff_x24;
  if (in_w5 == (byte)((-cVar1 | 0xbeU) + (-cVar1 & 0xbeU))) {
    ppuVar2 = &PTR_LAB_002793f0;
    if (*(char *)(in_x6 + (-DAT_002765f0 | 0xeb98be6e7b9ee79fU) +
                          (-DAT_002765f0 & 0xeb98be6e7b9ee79fU)) != ' ') {
      ppuVar2 = &PTR_LAB_00280a80;
    }
                    /* WARNING: Could not recover jumptable at 0x001ed2cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
  if (in_x4 != 0) {
    bVar4 = ((ulong)in_w16 & 0xff) != 0x258c7ff0bdabbd;
    bVar3 = 1 < (-DAT_002765f0 | 0xeb98be6e7b9ee7b0U) + (-DAT_002765f0 & 0xeb98be6e7b9ee7b0U);
    if ((!bVar3 || !bVar4) && bVar3 == bVar4) {
      *(undefined4 *)(unaff_x19 + 0x2c) = 0;
      *(undefined8 *)(unaff_x19 + 0x40) = param_1;
      *(undefined8 *)(unaff_x19 + 0x68) = in_x12;
                    /* WARNING: Could not recover jumptable at 0x001eaf30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR_LAB_00275578)();
      return;
    }
    ppuVar2 = &PTR_LAB_0027dbf0;
    if (in_x17 != 1) {
      ppuVar2 = &PTR_LAB_00274388;
    }
                    /* WARNING: Could not recover jumptable at 0x001eccd8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)*ppuVar2)();
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001eb514. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*DAT_0027adf8)(param_1,in_w5 == '\n');
  return;
}


