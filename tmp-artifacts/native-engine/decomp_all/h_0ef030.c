// entry=0xef030

void Hef030(void)

{
  ushort uVar1;
  uint in_w8;
  undefined1 in_w9;
  undefined8 in_x10;
  
  DAT_00282202 = (undefined1)((ulong)in_x10 >> 0x10);
  DAT_00282203 = (undefined1)((ulong)in_x10 >> 0x18);
  DAT_00282200 = (undefined1)in_x10;
  DAT_00282201 = in_w9;
  if ((in_w8 ^ 0x61c88647) + (in_w8 & 0x61c88647) * 2 != 0) {
                    /* WARNING: Could not recover jumptable at 0x001ebed8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027e890)();
    return;
  }
  uVar1 = (-(short)DAT_002765f0 & 0x7fffU | 0x679e) * 2 - (-(short)DAT_002765f0 ^ 0x679eU);
  DAT_0027a330 = DAT_0027a330 & uVar1 | DAT_0027a330 ^ uVar1;
                    /* WARNING: Could not recover jumptable at 0x001e78c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027e0f8)();
  return;
}


