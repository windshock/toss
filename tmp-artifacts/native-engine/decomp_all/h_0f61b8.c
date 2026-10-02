// entry=0xf61b8

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void Hf61b8(ulong param_1)

{
  undefined8 *puVar1;
  undefined **ppuVar2;
  ulong in_x13;
  ulong in_x15;
  long in_x17;
  long *unaff_x19;
  undefined1 auVar3 [16];
  
  auVar3 = a64_TBL(ZEXT816(0),
                   *(undefined1 (*) [16])
                    (unaff_x19[1] +
                     ((-DAT_00285dc0 ^ 0x94d41c6bb5830cfcU) +
                     (-DAT_00285dc0 & 0x14d41c6bb5830cfcU) * 2) * 0x14 +
                     (in_x15 ^ -param_1) + (in_x15 & -param_1) * 2 + -0xf),_DAT_0012c6c0);
  puVar1 = (undefined8 *)(*unaff_x19 + (param_1 ^ in_x13) + (param_1 & in_x13) * 2);
  puVar1[1] = auVar3._8_8_;
  *puVar1 = auVar3._0_8_;
  ppuVar2 = &PTR_LAB_0027c028;
  if ((param_1 -
      ((-DAT_00285dc0 | 0x94d41c6bb5830d0cU) + (-DAT_00285dc0 & 0x94d41c6bb5830d0cU) ^
      0xffffffffffffffff)) + -1 != in_x17) {
    ppuVar2 = (undefined **)
              (&DAT_0027fe78 +
              (int)((-(int)DAT_00285dc0 | 0xb5830d0eU) * 2 - (-(int)DAT_00285dc0 ^ 0xb5830d0eU)));
  }
                    /* WARNING: Could not recover jumptable at 0x001f62c0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


