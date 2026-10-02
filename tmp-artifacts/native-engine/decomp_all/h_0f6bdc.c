// entry=0xf6bdc

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void Hf6bdc(void)

{
  undefined **ppuVar1;
  long lVar2;
  long in_x13;
  long in_x15;
  ulong in_x16;
  ulong uVar3;
  ulong in_x17;
  ulong uVar4;
  long *unaff_x19;
  undefined1 auVar5 [16];
  
  if (in_x17 <= in_x16) {
    in_x16 = in_x17;
  }
  uVar3 = in_x16 + 1;
  if (uVar3 < (-DAT_00285dc0 ^ 0x94d41c6bb5830d0cU) + (-DAT_00285dc0 & 0x94d41c6bb5830d0cU) * 2) {
                    /* WARNING: Could not recover jumptable at 0x001f44ec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00277d70)();
    return;
  }
  uVar4 = -DAT_00285dc0;
  auVar5 = a64_TBL(ZEXT816(0),
                   *(undefined1 (*) [16])
                    (unaff_x19[1] +
                     ((-DAT_00285dc0 ^ 0x94d41c6bb5830cfcU) +
                     (-DAT_00285dc0 & 0x14d41c6bb5830cfcU) * 2) * 0x14 + in_x15 + -0xf),
                   _DAT_0012c6c0);
  lVar2 = *unaff_x19;
  ((undefined8 *)(lVar2 + in_x13))[1] = auVar5._8_8_;
  *(undefined8 *)(lVar2 + in_x13) = auVar5._0_8_;
  ppuVar1 = &PTR_LAB_0027c028;
  if (0xffffffffffffffff -
      ((-DAT_00285dc0 | 0x94d41c6bb5830d0cU) + (-DAT_00285dc0 & 0x94d41c6bb5830d0cU) ^
      0xffffffffffffffff) !=
      ((uVar3 ^ (uVar4 | 0x94d41c6bb5830cec) * 2 - (uVar4 ^ 0x94d41c6bb5830cec) ^ 0xffffffffffffffff
       ) & uVar3)) {
    ppuVar1 = (undefined **)
              (&DAT_0027fe78 +
              (int)((-(int)DAT_00285dc0 | 0xb5830d0eU) * 2 - (-(int)DAT_00285dc0 ^ 0xb5830d0eU)));
  }
                    /* WARNING: Could not recover jumptable at 0x001f62c0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


