// entry=0x76418

void H76418(void)

{
  undefined **ppuVar1;
  uint uVar2;
  uint in_w9;
  long in_x10;
  int in_w11;
  
  uVar2 = (in_w9 & 0xff | 0xffffffd0) * 2 - (in_w9 & 0xff ^ 0xffffffd0);
  if (9 < (byte)(*(char *)(in_x10 + 1) - 0x30U)) {
                    /* WARNING: Could not recover jumptable at 0x00178354. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00277268)();
    return;
  }
  ppuVar1 = &PTR_LAB_00283200;
  if ((uVar2 ^ in_w11 * 10) + (uVar2 & in_w11 * 10) * 2 < 0xccccccd) {
    ppuVar1 = &PTR_H76418_0027dbd8;
  }
                    /* WARNING: Could not recover jumptable at 0x001784ac. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


